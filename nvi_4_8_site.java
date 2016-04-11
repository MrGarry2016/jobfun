
r1, manager

What is difference between SOAP and RESTful

//TODO

what happens when you click amazon button

what is http, 特别纠正了http和html不同

//TODO ASK A LOT

what is database index

what kinds of trees do you know? give a example to use trie

His purpose is want me to answer phonebook

What is hadoop?

what is linkedlist? can you inplement a buffer? LRU buffer? ditributed LRU buffer?

r1.5 lunch 

how to find the longest node weights path in a DAG

r2, angela

1. what is difference index between primary key

2. Input: AB, CDE, FG, AB, (BA) output: f(3) = 3 for count the occurence of certain string, boudary case: f(4) = 3
which means BA and AB should be the same

Use hashmap and store all history strings. The interviewer gives boundary case of BA and thinks that hashmap is not optimal. Not give enought time to optimize this.

3. InputL a bunch of provider, each provide has property val. Output: f(n) should outputs sum(1, 2, ..., n), the sum of val of 1st to nth providers, only one consumer

4. find the intersection of linkedlist

r3, 眼睛长的很近的indian boy

1. compare java and c++, advantages of java compared with c++

2. Use hibernate to do join select

3. desgin a parking gaudget using OOP

4. write a complecated sql select
select id and the time of the maximun value for each tag
Input:
id time val
1  3:00 7
1  5:00 4
1  1:00 100
2  3:00 1
2  10:0 1000
2  11:00 4
Output:
id value_at_max_value_for_each_tag
id time
1  1:00
2  10:00

5. what is index, regulization

6. what is the protocal of websocket?

7. how to anthencate user and password?

8 give an example of git workflow, what is the code?

$ git clone <url> #克隆远程版本库
$ git init #初始化本地版本库

$ git status #查看状态
$ git diff #查看变更内容
$ git add . #跟踪所有改动过的文件
$ git add <file> #跟踪指定的文件
$ git mv <old> <new> #文件改名
$ git rm <file> #删除文件
$ git rm --cached <file> #停止跟踪文件但不删除
$ git commit -m “commit message” #提交所有更新过的文件
$ git commit --amend #修改最后一次提交

$ git log #查看提交历史
$ git log -p <file> #查看指定文件的提交历史
$ git blame <file> #以列表方式查看指定文件的提交历史

git reset --hard HEAD #撤消工作目录中所有未提交文件的修改内容
$ git checkout HEAD <file> #撤消指定的未提交文件的修改内容
$ git revert <commit> #撤消指定的提交

$ git branch #显示所有本地分支
$ git checkout <branch/tag> #切换到指定分支或标签
$ git branch <new-branch> #创建新分支
$ git branch -d <branch> #删除本地分支
$ git tag #列出所有本地标签
$ git tag <tagname> #基于最新提交创建标签
$ git tag -d <tagname> #删除标签

$ git merge <branch> #合并指定分支到当前分支
$ git rebase <branch> #衍合指定分支到当前分支

$ git remote -v #查看远程版本库信息
$ git remote show <remote> #查看指定远程版本库信息
$ git remote add <remote> <url> #添加远程版本库
$ git fetch <remote> #从远程库获取代码
$ git pull <remote> <branch> #下载代码及快速合并
$ git push <remote> <branch> #上传代码及快速合并
$ git push <remote> :<branch/tag-name> #删除远程分支或标签
$ git push --tags #上传所有标签


r4, charmful 白人大叔

1. Give, html, background application, workqueue, background computer, database, database buffer. User reports slow speed. Analysis reason

My answer, check database if ok or not, check background computer is ok or not.

Follow up, database is OK, background computer is OK. One tomcat box have several application, can this be the slow reason? how to monitor the IO and memery usage
of one tomcat box? why it fails when too many tasks runs on the same tomcat box?

2. reverse the linkedlist and check there is a circle or not in a linkedlist?

3. sql 
input: 
studetn table
id  name
course table
id name
studentcourse table
studentid courseid grade

Output:
Tom math 95
Tom English 100
Jack Math 1

Follow up
how to output
Tom math 95
Tom - -
Jack Math 1

and 

Tom math 95
Tom English -
Jack Math 1

4. Is final necessary in Java, why c++ do not have final but java has?


r5 fat india boy

1. what is http?

2. what is index, what id database regulization?

3. input 10-> 2-> 3->1->5->9
output: 10->1->9->2->5->3
sort linked list and reverse the last half and put two together


