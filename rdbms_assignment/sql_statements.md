creating tables:

1)create table user(
id int not null auto_increment,
username varchar(20) not null,
password varchar(20),
utype boolean,
primary key(id) 


)


2)create table questionbank(
id int not null auto_increment,
question varchar(255),
userid int not null,
primary key(id),
foreign key(userid) references user(id)

)

3)create table options(
id int not null auto_increment,
optiondes varchar(255) not null,
is_correct boolean not null,
ques_bank_id int not null,
primary key(id),
foreign key(ques_bank_id) references questionbank(id)
)

4)create table test(
id int not null auto_increment,
q_bank_id int not null,
assessment_id int not null,
primary key(id),
foreign key(q_bank_id) references questionbank(id)
)

5)create table assessmentlog(
id int not null auto_increment,
test_id int not null,
user_id int not null,
time int not null,
chosen_ans varchar(2) not null,
primary key(id),
foreign key(test_id) references test(id),
foreign key(user_id) references user(id)

)

--------------------------------------------------------------------------
insert queries:
user:

1)insert into user(username,password,utype) values ('rakshith','xyz',1);
2)insert into user(username,password,utype) values ('prasanna','xyz1',0);
3)insert into user(username,password,utype) values ('meghana','xyz12',0);
4)insert into user(username,password,utype) values ('sudha','xyz123',0);



questionbank table:
1)insert into questionbank(question,userid) values ('who is the president of india',1);
2)insert into questionbank(question,userid) values ('which year did india win its first cricket worldcup',1);
3)insert into questionbank(question,userid) values ('Grand Central Terminal, Park Avenue, New York is the worlds ',1);
4)insert into questionbank(question,userid) values ('Entomology is the science that studies',1);
5)insert into questionbank(question,userid) values ('For which of the following disciplines is Nobel Prize awarded?',1);
6)insert into questionbank(question,userid) values ('FFC stands for',1);
7)insert into questionbank(question,userid) values ('Epsom (England) is the place associated with ',1);
8)insert into questionbank(question,userid) values ('Friction can be reduced by changing from ',1);
9)insert into questionbank(question,userid) values ('Film and TV institute of India is located a ',1);
10)insert into questionbank(question,userid) values ('The ozone layer restricts',1);
11)insert into questionbank(question,userid) values ('Euclid was',1);
12)insert into questionbank(question,userid) values ('Golden Temple, Amritsar is India s ',1);


options table:

1) insert into options(optiondes,is_correct,ques_bank_id) values (pranab mukherjee,1,1);
2)insert into options(optiondes,is_correct,ques_bank_id) values (a p j abdul kalam,0,1)
3)insert into options(optiondes,is_correct,ques_bank_id) values (1993,1,2)
4)insert into options(optiondes,is_correct,ques_bank_id) values (1995,0,2)
5)insert into options(optiondes,is_correct,ques_bank_id) values ( largest railway,1,3 )
6)insert into options(optiondes,is_correct,ques_bank_id) values (longest railway,0,3)
7)insert into options(optiondes,is_correct,ques_bank_id) values (behaviour of humans,0,4)
8)insert into options(optiondes,is_correct,ques_bank_id) values (insects,1,4)
9)insert into options(optiondes,is_correct,ques_bank_id) values (physics and chemistry,1,5)
10)insert into options(optiondes,is_correct,ques_bank_id) values (mathematics,0,5)
11)insert into options(optiondes,is_correct,ques_bank_id) values (foreign finance corporation,0,6)
12)insert into options(optiondes,is_correct,ques_bank_id) values (film finance corporation,1,6)
13)insert into options(optiondes,is_correct,ques_bank_id) values (horse racing,1,7)
14)insert into options(optiondes,is_correct,ques_bank_id) values (polo,0,7)
15)insert into options(optiondes,is_correct,ques_bank_id) values (sliding to rolling,1,8)
16)insert into options(optiondes,is_correct,ques_bank_id) values (dynamic to static,0,8)
17)insert into options(optiondes,is_correct,ques_bank_id) values (pune,1,9)
18)insert into options(optiondes,is_correct,ques_bank_id) values (rajkot,0,9)
19)insert into options(optiondes,is_correct,ques_bank_id) values (visible light,0,10)
20)insert into options(optiondes,is_correct,ques_bank_id) values (ultra violet,1,10)
21)insert into options(optiondes,is_correct,ques_bank_id) values (greek mathematician,1,11)
22)insert into options(optiondes,is_correct,ques_bank_id) values (astronomer,0,11)
23)insert into options(optiondes,is_correct,ques_bank_id) values (largest gurudwara,1,12)
24)insert into options(optiondes,is_correct,ques_bank_id) values (oldest  gurudwara,0,12)



table test:

1)inert into test(q_bank_id,assessment_id) values (1,1);
2)inert into test(q_bank_id,assessment_id) values (2,1);
3)inert into test(q_bank_id,assessment_id) values (3,1);
4)inert into test(q_bank_id,assessment_id) values (4,1);
5)inert into test(q_bank_id,assessment_id) values (5,1);
6)inert into test(q_bank_id,assessment_id) values (6,1);
7)inert into test(q_bank_id,assessment_id) values (7,1);
8)inert into test(q_bank_id,assessment_id) values (8,1);
9)inert into test(q_bank_id,assessment_id) values (9,1);
10)inert into test(q_bank_id,assessment_id) values (10,1);


table assessmentlog:

1)insert into answerlog(test_id,user_id,time,chosen_ans)  values (1,2,30,1);
2)insert into answerlog(test_id,user_id,time,chosen_ans)  values (2,2,45,3);
3)insert into answerlog(test_id,user_id,time,chosen_ans)  values (3,2,15,6);
4)insert into answerlog(test_id,user_id,time,chosen_ans)  values (4,2,15,8);
5)insert into answerlog(test_id,user_id,time,chosen_ans)  values (5,2,30,9);
6)insert into answerlog(test_id,user_id,time,chosen_ans)  values (6,2,20,12);
7)insert into answerlog(test_id,user_id,time,chosen_ans)  values (7,2,25,13);
8)insert into answerlog(test_id,user_id,time,chosen_ans)  values (8,2,25,16);
9)insert into answerlog(test_id,user_id,time,chosen_ans)  values (9,2,50,17);
10)insert into answerlog(test_id,user_id,time,chosen_ans)  values (10,2,60,20);



query for view:

create view score AS select count(o.optiondes) as marks from options as o, 
assessmentlog as a,test as t where o.id=a.chosen_ans and t.id=a.test_id
and o.is_correct=1 and a.user_id=2 and t.assessment_id=1 ;



pivot table:

create view temptable as select u.username,q.id questionId, u.id userID,t.assessment_id, q.question, o.optiondes from user as u, options as o, assessmentlog as a, test as t,questionbank as q where o.id=a.chosen_ans and t.id=a.test_id  and q.id=t.q_bank_id and u.id =2 and u.id=a.user_id and q.id=t.q_bank_id;

SET @sql = NULL;
select group_concat(distinct concat('max(if(tt.questionId = ''',questionId,''',optiondes,NULL)) as', quote(questionId))) into @sql from temptable tt;
set @sql = concat('select userID,username,',@sql,' from temptable tt');
prepare statement from @sql;
