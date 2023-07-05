


var mList = document.querySelectorAll('#tunes');
console.log(mList);

mList.item(0).addEventListener("click", MUS001);

function MUS001() {
	
window.location.href = "music/tanuki.jsp";	
	
console.log(mList.item(0));	

} 


mList.item(1).addEventListener("click", MUS002);

function MUS002() {
	
window.location.href = "music/pipa.jsp";	

console.log(mList.item(1));
}


mList.item(2).addEventListener("click", MUS003);

function MUS003() {
	
	
window.location.href = "music/bamboo.jsp";

console.log(mList.item(2));

}

mList.item(3).addEventListener("click", MUS004);

function MUS004() {
	
window.location.href = "music/cranes.jsp";

console.log(mList.item(3));

}


mList.item(4).addEventListener("click", MUS005);

function MUS005() {
	
	
	
window.location.href = "music/warrior.jsp";

console.log(mList.item(4));

}


mList.item(5).addEventListener("click", MUS006);

function MUS006() {
	
window.location.href = "music/mountain.jsp";


console.log(mList.item(5));

}



