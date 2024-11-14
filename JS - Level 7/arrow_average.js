const arr = [1, 3, 5, 6];
const arrayAverage = (arr) => {
    let sum = 0;
    for (let i = 0; i < arr.length; i++) { 
        sum += arr[i];
    }
    return sum / arr.length;
}
console.log(arrayAverage(arr));