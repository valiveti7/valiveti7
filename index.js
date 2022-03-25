class Car{
    constructor(firstname='1',middlename='2',lastname='3'){
            this.firstname=firstname;
            this.middlename=middlename;
            this.lastname=lastname;
    }
    displayname(){
        console.log(this.firstname+this.middlename+this.lastname)
    }
}
const car1=new Car('sriram ','kumar ','valiveti');
const car2=new Car('sri ','ram ','v');
const car3=new Car();
console.log(car1.firstname+car1.middlename+car1.lastname);
console.log(car2.firstname+car2.middlename+car2.lastname);
car1.displayname();
car3.displayname();
