const student = {
    name: "sachin",
    age: 20,
    marks: 56,
    getAge: function () { 
        console.log(this);// Function Scope;
        // return this.age;
    },
    getMarks: () =>{
        console.log(this); // Windows Scope 
        // return this.marks;
    },
    getInfo1: function () { 
        setTimeout(() => {
            console.log(this)
        }, 2000);
    },
    getInfo2: function () { 
        setTimeout(function () {
            console.log(this)
        }, 2000);
    }
};

