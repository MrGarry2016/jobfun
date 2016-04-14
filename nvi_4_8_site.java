
r1, manager

What is difference between SOAP and RESTful
	SOAP (Simple Object Access Protocol) is a messaging protocol that allows programs that run on disparate operating systems (such as Windows and Linux) to communicate using Hypertext Transfer Protocol (HTTP) and its Extensible Markup Language (XML)
	SOAP is a standard for encoding messages in XML that invoke functions in other applications.
	1. It is platform and language independent.
	2. SOAP provides simplified communications through proxies and firewalls

	1. SOAP is typically much slower than other types of middleware standards, including CORBA

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

9. what is the command to find a file in Linux

find <path> -iname "filename"

sudo updatedb
locate -n 20 -i "*.jpg"

grep -r -i "search query" /path/to/derectory
-i means case sensitive

10. http 各种 返回码 含义 (404,...)
1xx Informational
100 Continue
The server has received the request headers and that the client should proceed to send the request body 
101 Switching Protocols
The requester has asked the server to switch protocols and the server has agreed to do so.[7]
2xx Success
200 OK
Standard response for successful HTTP requests. 
201 Created
The request has been fulfilled, resulting in the creation of a new resource
202 Accepted
The request has been accepted for processing, but the processing has not been completed.
204 No Content
The server successfully processed the request and is not returning any content
205 Reset Content
The server successfully processed the request, but is not returning any content. Unlike a 204 response, this response requires that the requester reset the document view
206 Partial Content (RFC 7233)
The server is delivering only part of the resource (byte serving) due to a range header sent by the client
3xx Redirection
300 Multiple Choices
Indicates multiple options for the resource from which the client may choose. 
301 Moved Permanently
This and all future requests should be directed to the given URI
304 Not Modified (RFC 7232)
Indicates that the resource has not been modified since the version specified by the request headers
305 Use Proxy (since HTTP/1.1)
The requested resource is available only through a proxy, the address for which is provided in the response.
307 Temporary Redirect (since HTTP/1.1)
In this case, the request should be repeated with another URI
4xx Client Error
400 Bad Request
The server cannot or will not process the request due to an apparent client error
401 Unauthorized (RFC 7235)
Similar to 403 Forbidden, but specifically for use when authentication is required and has failed or has not yet been provided. 402 Payment Required
Reserved for future use.
402 Payment Required
Reserved for future use.
403 Forbidden
The request was a valid request, but the server is refusing to respond to it.
404 Not Found
The requested resource could not be found but may be available in the future
405 Method Not Allowed
A request method is not supported for the requested resource; for example, a GET request on a form which requires data to be presented via POST, or a PUT request on a read-only resource.
406 Not Acceptable
The requested resource is capable of generating only content not acceptable according to the Accept headers sent in the request
407 Proxy Authentication Required (RFC 7235)
The client must first authenticate itself with the proxy.
408 Request Timeout
The server timed out waiting for the request.
409 Conflict
Indicates that the request could not be processed because of conflict in the request, such as an edit conflict between multiple simultaneous updates.
410 Gone
Indicates that the resource requested is no longer available and will not be available again. 
411 Length Required
The request did not specify the length of its content, which is required by the requested resource
412 Precondition Failed (RFC 7232)
The server does not meet one of the preconditions that the requester put on the request
5xx Server Error
500 Internal Server Error
A generic error message, given when an unexpected condition was encountered and no more specific message is suitable
502 Bad Gateway
The server was acting as a gateway or proxy and received an invalid response from the upstream server


11. what is less command
less 工具也是对文件或其它输出进行分页显示的工具，应该说是linux正统查看文件内容的工具，功能极其强大。less 的用法比起 more 更加的有弹性。在 more 的时候，我们并没有办法向前面翻， 只能往后面看，但若使用了 less 时，就可以使用 [pageup] [pagedown] 等按键的功能来往前往后翻看文件，更容易用来查看一个文件的内容！除此之外，在 less 里头可以拥有更多的搜索功能，不止可以向下搜，也可以向上搜



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

5. how to monitor tomcat memory useage?
You can access the memory usage for the Tomcat JVM using JMX pretty easy. 
Please note that you will get memory usage for tomcat + all deployed web apps. 
You cannot get memory usage for a single webapp, since Tomcat share a single java process for both container and apps. 
If you want better control over memory usage per app, I suggest you either use a more sophisticated application server or 
use a tomcat instance per webapp.
To monitor connected users, I guess you have to do something on the application layer. Tomcat is not really aware of the concept of "user", 
since that is typically something you implement in the code (like Spring Security).


r5 fat india boy

1. what is http?

2. what is index, what id database regulization?

3. input 10-> 2-> 3->1->5->9
output: 10->1->9->2->5->3
sort linked list and reverse the last half and put two together


