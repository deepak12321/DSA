/**
 * @param {number} x
 * @return {boolean}
 */

var isPalindrome = (x) => {
  let str = x.toString();
  return str === str.split("").reverse().join("");
};
