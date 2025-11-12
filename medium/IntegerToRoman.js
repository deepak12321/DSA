/*
Problem Link :- https://leetcode.com/problems/integer-to-roman/description/
    4ms
 Beats 70.66%
*/

var intToRoman = function (num) {
  const ones = ["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"];
  const tens = ["", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"];
  const hundreds = ["", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"];
  const thousands = ["", "M", "MM", "MMM"];

  let solution = "";
  let place = 0;

  while (num !== 0) {
    const digit = num % 10;
    switch (place) {
      case 0:
        solution = ones[digit] + solution;
        break;
      case 1:
        solution = tens[digit] + solution;
        break;
      case 2:
        solution = hundreds[digit] + solution;
        break;
      case 3:
        solution = thousands[digit] + solution;
        break;
    }
    num = Math.floor(num / 10);
    place++;
  }

  return solution;
};
