//number array with for loop
var arr = [1, 4, 6, 3, 9];
for (var i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}
//sttring array with new for loop
var s_array = ["vamsi", "sai", "krishna"];
for (var _i = 0, s_array_1 = s_array; _i < s_array_1.length; _i++) {
    var i = s_array_1[_i];
    if (i == "sai") {
        console.log("sai found");
    }
    console.log(i);
}
//sum of 1 to 5 numbers
var sum = 0;
for (var i = 1; i <= 5; i++) {
    sum += i;
}
console.log(sum);
