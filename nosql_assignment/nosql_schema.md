use case:
1)user is of three types normal user with minimal permissions,admin and a super user with all or maximum procedures
2)timestamp of of all possible updates of user, recorded along with time
3) pages can be modified
4)a modification collection is used to record the modifications done by the user and the comments received for those modifications.



schema:

User{
	_id=ObjectID();
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
_id=ObjectID();
title:"<string>",
content:"<string>"
slug:"<string>",
modification_id:Object<MOdification>

}


Modification{
	_id=ObjectID();
	user_id:[{user_id:"<User>",time:"<timestamp>",title:"<String>"}],
	comments:{text:"<text displayed>",user_id:"<user who writes comment>",time:<timestamp>}

}


Role{
	user_id:"User id",
	role:"admin or super admin or user"

}
