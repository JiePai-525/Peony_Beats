


var aList = document.querySelectorAll('#a_read');
console.log(aList);



aList.item(0).addEventListener("click", AUD001);

function AUD001() {
	
	
window.location.href = "audiobooks/taro.jsp";
	
console.log(aList.item(0));	

} 


aList.item(1).addEventListener("click", AUD002);

function AUD002() {
	
window.location.href = "audiobooks/monkeys.jsp";

console.log(aList.item(1));
}


aList.item(2).addEventListener("click", AUD003);

function AUD003() {
	
window.location.href ="audiobooks/rabbits.jsp";

console.log(aList.item(2));

}

aList.item(3).addEventListener("click", AUD004);

function AUD004() {
	
window.location.href = "audiobooks/kachi.jsp";

console.log(aList.item(3));

}


