function Car(license, driver){
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
}

Car.prototype.printDataCar = function(){
    console.log("Name: " + this.driver.name)
    console.log("Document: " + this.driver.document)
    console.log("License: " + this.license)
}