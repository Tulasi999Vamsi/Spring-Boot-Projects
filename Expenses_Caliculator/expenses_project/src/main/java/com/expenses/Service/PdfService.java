package com.expenses.Service;

import com.expenses.Models.Expense;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;

@Service
public class PdfService {

    public byte[] generatePdf(List<Expense> expenses, double totalAmount) throws DocumentException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            Document document = new Document();
            PdfWriter.getInstance(document, baos);
            document.open();

            // Add title
            document.add(new Paragraph("Expense Report"));

            // Create table with headers
            PdfPTable table = new PdfPTable(3);
            table.addCell("ID");
            table.addCell("Description");
            table.addCell("Amount");

            // Add data to table
            for (Expense expense : expenses) {
                table.addCell(String.valueOf(expense.getId()));
                table.addCell(expense.getDescription());
                table.addCell(String.valueOf(expense.getAmount()));
            }

            // Add table to document
            document.add(table);

            // Add total amount
            document.add(new Paragraph("Total Amount: " + totalAmount));

            document.close();
            return baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DocumentException("Error generating PDF", e);
        }
    }
}
