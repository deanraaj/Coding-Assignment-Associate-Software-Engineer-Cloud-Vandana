function sortArrayDescending(arr) {
    // Use the sort method with a custom comparison function
    arr.sort(function(a, b) {
        return b - a;
    });
    return arr;
}

// Example usage
const inputArray = [5, 2, 9, 1, 5, 6];
const sortedArray = sortArrayDescending(inputArray);
console.log("Sorted Array in Descending Order: " + sortedArray);
