let userInput = prompt("Please enter The number:");
let input_number = sum(parseInt(userInput));

function sum(n){
   let i, sum_all = 0;

   for (i = 0;i <= n;i++){
      sum_all += i;

   }

   return sum_all;
}
document.getElementById("sum_input").textContent = `Sum of Input Numbers: ${input_number}`;