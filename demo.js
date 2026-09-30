//1st

let totalamount = 3000;
if(totalamount >= 3000){
    console.log("25% discount of " + totalamount + "is"+ totalamount*(25/100));
    // console.log(totalamount*(25/100));
}else if(totalamount >= 2000){
    console.log("20% discount of" + totalamount + "is"+ totalamount*(20/100));
    // console.log(totalamount*(20/100));
}
else if(totalamount >= 1000){
    console.log("10% discount of" + totalamount + "is"+ totalamount*(10/100));
    // console.log(totalamount*(10/100));
}
else{
    console.log("discount"); 
}


//2nd see in room

let units=210;
if(units>0 &&units<=100){
    console.log("5rs per unit");
    console.log(units*100);
}else if(units>100 && units<=200){
    console.log("7rs per unit");
    console.log((units*5)+(units-100)*7);
}
else{
    console.log("10rs per unit");
    console.log(units*10);
}


//3rd


}