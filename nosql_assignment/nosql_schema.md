use case:
1)user is of three types normal user with minimal permissions,admin and a super user with all or maximum procedures
2)timestamp of of all possible updates of user, recorded along with time
3) pages can be modified
4)a modification collection is used to record the modifications done by the user and the comments received for those modifications.



schema:

User{
	_id=ObjectId();
	login_id:"<string>",
	password:"<string>",
	User_profile:{

			firstname:"<string>"
			lastname:"<string>"
			contact_num:{phone1:"<string>",phone2:"<string>"}	
		}
	gender:"<string>",
	timestamp:{login_timestamp:"[array of timestamp]",profile_update:"[array of timestamp]"},
	role_id:Object<Role>
}




Pages{
_id=ObjectId();
title:"<string>",
content:"<string>"
slug:"<string>",


}


Modification{
	_id=ObjectId();
	page_id:<Page id of the modified page>
	modification:[{user_id:"",date:""}]
	comments:[{comment_id:<id for comment>,text:<comment text>,user_id:<user who commented>,time:<timestamp>}],
	title:""
}


Role{
	user_id:"User id",
	role:"admin or super admin or user"

}


db.role.insert({user_id:"rakshith",role:})
