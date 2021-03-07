
var Datastore = require('nedb');
           // Creates a table called "trainers"
var trainers = new Datastore({ filename: 'trainers.db', autoload: true });

          // Creates a table called "members"
var members = new Datastore({ filename: 'members.db', autoload: true });

         // Creates a table called "classes"
var classes = new Datastore({ filename: 'classes.db', autoload: true });

var trainers =[]; // creates an array of trainers objects

trainers.insert(
  {
    "TrainerID":"R001",
    "TrainerName":"Anne Rogers Clark",
    "GymName":"Muscle Monsters",
    "Address":"116 Centereach Mall",
    "City":"Centereach",
    "State":"New York",
    "Zip": 11720,
    "Phone": 516-330-2020,
    "Email":"AnneRogrs@gmail.com"
});
  
  trainers.insert(
  {
    "TrainerID":"R002",
    "TrainerName":"Francis Butler",
    "GymName":"Muscle Monsters",
    "Address":"100 Thruway Plaza",
    "City":"Cheektowaga",
    "State":"New York",
    "Zip": 14225,
    "Phone": 616-229-1529,
    "Email":"francisb@hotmail.com"
  });
  
  trainers.insert(
  {
    "TrainerID":"R006",
    "TrainerName":"Jeanette Spencer",
    "GymName":"Muscle Monsters",
    "Address":"139 Merchant Place",
    "City":"Cobleskill",
    "State":"New York",
    "Zip": 12043,
    "Phone": 633-120-5560,
    "Email":"JeaneSpen@gmail.com"
  });

   trainers.insert(  {
    "TrainerID":"R003",
    "TrainerName":"Tim Travis",
    "GymName":"Muscle Monsters",
    "Address":"85 Crooked Hill Road",
    "City":"Commack",
    "State":"New York",
    "Zip": 11725,
    "Phone": 516-349-2229,
    "Email":"timtra@hotmail.com"
  });
   trainers.insert(
  {
    "TrainerID":"R004",
    "TrainerName":"Joseph Fine",
    "GymName":"Muscle Monsters",
    "Address":"872 Route 13",
    "City":"Cortlandville",
    "State":"New York",
    "Zip":13045,
    "Phone": 216-554-1000,
    "Email":"josfine@hotmail.com"
  });
  
  trainers.insert(
  {
    "TrainerID":"R005",
    "TrainerName":"Lewis Smith",
    "GymName":"Muscle Monsters",
    "Address":"12465 Hempstead Turnpike",
    "City":"East Meadow",
    "State":"New York",
    "Zip": 11554,
    "Phone": 631-211-11286,
    "Email":"lewiss@gmail.com"
  });
  
      trainers.push(trainers);
// should give the correct result now
trainers.insert(trainers, function(err, docs) {
    docs.forEach(function(d) {
        console.log('Saved trainers:', d.name);
    });
});


