user collection:
db.user.insert(
{
_id:ObjectId(),
login_id:"aki05",
password:"12345",
User_profile:{
firstname:"akhilesh",
lastname:"bhat",
contact_num:{phone1:"9740561646",phone2:"9740672534"}	
},
gender:"male",
timestamp:{login_timestamp:"23/12/2015",profile_update:"24/12/2015"},
role_id:1
}
)
-------------------------------------------------------------------
role collection:
db.role.insert({

_id:ObjectId(),
user_id:"aki05",
role:1
})

-----------------------------------------------------------------------
page collection:

db.page.insert({
_id:ObjectId(),
title:"help",
content:"topics 1)how to login",
slug:"/help",
modification_id:1

}
)

-----------------------------------------------------------------


modification collection:
db.insert.modificatin({

page_id="home",
modification:[{user_id:"aki05",date:"04/04/2015"}],
comments:[{comment_id:c1,text:"explain changes",user_id:"kev",time:<01/04/2015>}]

})



























assignment query:
var a = db.role.find({"role":"admin","user_id":"abc"}, {_id:1}).map(function(item){ return item._id; })

db.user.insert({
... ... ... 
... ... ... _id:ObjectId(),
... ... ... login_id:"kev",
... ... ... password:"12345",
... ... ... User_profile:{
... ... ... 
... ... ... firstname:"akhilesh",
... ... ... lastname:"bhat",
... ... ... contact_num:{phone1:"9740561646",phone2:"9740672534"}
... ... ... },
... ... ... gender:"male",
... ... ... timestamp:{login_timestamp:"23/12/2015",profile_update:"24/12/2015"},
... ... ... role_id:a
... ... ... 
... ... ... })
