# NaturalLanguageDatabase
An engine that provides an natural language interface to any database. Essentially it converts user's natural language question into a database compliant query.

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
	<META HTTP-EQUIV="CONTENT-TYPE" CONTENT="text/html; charset=utf-8">
	<TITLE></TITLE>
	<META NAME="GENERATOR" CONTENT="LibreOffice 4.1.6.2 (Linux)">
	<META NAME="CREATED" CONTENT="20160516;192400000000000">
	<META NAME="CHANGEDBY" CONTENT="Pulkit Gupta">
	<META NAME="CHANGED" CONTENT="20160517;135400000000000">
	<META NAME="AppVersion" CONTENT="14.0000">
	<META NAME="DocSecurity" CONTENT="0">
	<META NAME="HyperlinksChanged" CONTENT="false">
	<META NAME="LinksUpToDate" CONTENT="false">
	<META NAME="ScaleCrop" CONTENT="false">
	<META NAME="ShareDoc" CONTENT="false">
	<STYLE TYPE="text/css">
	<!--
		@page { margin-left: 1in; margin-right: 1in; margin-top: 1in; margin-bottom: 0.5in }
		P { margin-bottom: 0.08in; direction: ltr; widows: 2; orphans: 2 }
		A:link { so-language: zxx }
	-->
	</STYLE>
</HEAD>
<BODY LANG="en-IN" BGCOLOR="#ffffff" DIR="LTR">
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>Chapter
- 1</B></FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>INTRODUCTION</B></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Interaction
with computers has been a problem for most people that have had a
chance to do so. Most work done on such systems is repetitive and
specialized which results in the creation of small one – off 
programs that result in the wastage of programming effort. Moreover,
end users (developers in this case) are burdened with the task of
learning a large number of domain specific languages which further
increases the effort and money spent on training.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
goal of program synthesis is to construct automatically a program
that provably satisfies a given high level specification. Previously
implemented program synthesis techniques use complete specifications
of the language but it is often difficult to check without user
interference that the specification is been followed by the
synthesized program. Also such specifications are hard to write. More
recent implementations have started to use incomplete specifications
that are easier to write. Such systems are known as PBEs (Programming
by Example). We will try to use both techniques and point out their
pros and cons.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>In
this project we will address the problem of synthesizing programs
based on an underlying DSL (domain specific language) from NL(natural
language). Since NL is inherently imprecise, so we won’t always be
able to generate a perfectly accurate query. Instead we will generate
a ranked set of queries and ask the user to select the one he/she
thinks is the most appropriate. This will also allow us to view how
our product is working and what it’s ranking efficiency is.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<OL>
	<OL>
		<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT COLOR="#0d0d0d"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>Requirement
		Analysis</B></FONT></FONT></FONT></P>
	</OL>
</OL>
<P ALIGN=JUSTIFY STYLE="margin-left: 0.25in; margin-bottom: 0in; line-height: 150%">
<BR>
</P>
<OL>
	<OL>
		<OL>
			<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%">
			<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>Software
			Requirements:</B></FONT></FONT></P>
		</OL>
	</OL>
</OL>
<P ALIGN=JUSTIFY STYLE="margin-left: 0.5in; margin-bottom: 0in; line-height: 150%">
<BR>
</P>
<P ALIGN=JUSTIFY STYLE="text-indent: 0.5in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>1.</B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>
     Speech Recognition Tool</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="text-indent: 0.5in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>2.</B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>
     NLP Tools</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="text-indent: 0.5in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>3.</B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>
     Operating System</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="text-indent: 0.5in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>4.</B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>
     DBMS.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="text-indent: 0.5in; margin-bottom: 0in; line-height: 150%">
<BR>
</P>
<P ALIGN=JUSTIFY STYLE="text-indent: 0.5in; margin-bottom: 0in; line-height: 150%">
<BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-top: 0.21in; margin-bottom: 0.21in; line-height: 150%">
<FONT COLOR="#0d0d0d"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>1.1.2
Hardware Requirements:</B></FONT></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="text-indent: 0.5in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>1.</B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>
     Client System</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="text-indent: 0.5in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>2.</B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>
     Microphone</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="text-indent: 0.5in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>3.</B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>
     Database Server</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<OL>
	<OL START=2>
		<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0.11in; line-height: 150%">
		<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>Objectives</B></FONT></FONT></P>
	</OL>
</OL>
<P ALIGN=JUSTIFY STYLE="margin-left: 0.25in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>1.</B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>
     Speech to Text Integration</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-left: 0.25in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>2.</B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>
     Keyword extraction from textual data (using NLP tools)</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="text-indent: 0.25in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>3.</B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>
     Recommendation system to rank queries</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="text-indent: 0.25in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>4.</B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>
     Front end to show generated ranked queries to user</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="text-indent: 0.25in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>5.</B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>
     Interfacing with Database/Program</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>1.2.1
Sub Objectives</B></FONT></FONT></P>
<OL>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Integrating
	Speech to text as a JS script</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Connecting
	controlling to model</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Integrating
	NLP POS Tagger</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%">
	<FONT FACE="Times New Roman, serif"><FONT SIZE=3>Extracting only
	noun keywords</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Querying
	database for keyword relations</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Generating
	trivial queries</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Combining
	trivial queries to complex queries</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Generating
	UI for output webpage</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Connecting
	model and view</FONT></FONT></P>
</OL>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>Chapter
- 2</B></FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>SYSTEM
ANALYSIS</B></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>2.1
Existing System</B></FONT></FONT><FONT FACE="Times New Roman, serif">	
	 	<BR></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>A
recent study on the topic of Program Synthesis was published in a
research paper named </FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>Compositional
Program Synthesis from Natural Language and Example </B></FONT></FONT><FONT FACE="Times New Roman, serif"><FONT SIZE=3>in
January, 2015 where they described a domain-agnostic program
synthesis framework and algorithm, with which complex tasks can be
accomplished by providing input in a compositional manner. Other
papers related to this topic also propose and give examples for
automatically generating programs from a compositional input of
natural language and examples. </FONT></FONT>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>These
theories and implementations used a specific database with an inbuilt
schema to generate queries for. Token generation is hardwired to this
schema in the sense that keywords are identified from the input
statement only if the keyword occurs somewhere in the schema
declaration or the entries. These tokens are then passed to the
synthesizer to generate a meaningful list of programs that fully
represent the input of the user and maintain the compliance with the
inbuilt database.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Other
popular artificial intelligence systems such as Google Voice and
Alexa translate natural language to queries for the search engine
system which is not useful for enterprise applications since most
enterprises use a private database whose schema is not available
until the program is deployed on their system / server.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Moreover
most of these systems are either theories or large scale deployments
which are not open source or available for public use either. The
implementations made for the related papers only focus on the
particular of domain they are solving and also are hard to salvage
from the documents of concerned organizations / colleges. The
projects deployed at a large scale are also not available for
in-depth research or for personal or professional deployments.</FONT></FONT><FONT FACE="Times New Roman, serif">
</FONT>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><SPAN STYLE="background: #ffffff">
</SPAN><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>2.2
Motivation</B></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
motivation for this project is the need for an open source system
that can be deployed in small environments and can also be scaled to
bigger environments. Most of the existing systems listed above share
this problem. As more and more enterprises start to realize the
importance of big data, they are starting to embrace the fact that
they need to store and index huge amounts of data. This data then
needs to be processed by efficient systems which use the big data
approach to organize data in a human comprehensible format. However
such big data applications lack the key approach of interacting with
the user in a more user friendly and natural way so as to allow
non-technical personnel available in such enterprises to also
effectively make use of the huge amount of data collected and stored.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Also,
with the evolving nature of artificial intelligence domain, more and
more applications are now focussed on providing an assistant to the
user which handles all the hard work of understanding various
versions of input  to the system and providing the desired output in
a way that is more easily grasped and can easily be used by the users
available in various demographics. This project would thus be an
addition to such systems where our system would allow the user to run
queries on any enterprise based database using just natural questions
and queries instead of the long process of grasping and having a good
understanding of the DSL before understanding the required result
format and then using such information to build a program / query to
run on such data.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B><SPAN STYLE="background: #ffffff">2.3
Proposed System</SPAN></B></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
system is built on the MVC (Model View Controller) architecture where
the controller of the system is a JavaScript script which allows the
user’s speech to be converted to text on the user’s system
itself. Then this text is passed on to the model which is the query
synthesizer comprising of a set of java files which do all the work
from extracting keywords, to comparing them against the database
schema and finally ranking the generated queries. The ranked query
strings are then exported to the view of the system which is a
webpage which allows the user to view and select the desired queries.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
selected query is returned to the servlet controller which passes the
query to a model class which accesses the database and return the
desired result to the view which is a web page which is populated
with the result and then served to the user. Thus the system shall be
deployable to small and big environments as a server application on
the local server used by the enterprise. This will also be beneficial
since most enterprises host their database onto the serve and so our
system will easily be able to interface with the database and
generate the required result.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>Chapter
– 3</B></FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>DESIGN</B></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>3.1
Methodology</B></FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><IMG SRC="http://imgur.com/GBvDGQm.jpg" NAME="Picture 10" ALIGN=BOTTOM WIDTH=342 HEIGHT=809 BORDER=0></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Fig.3
1:Activity Diagram</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>In
voice base query implementation the client will speak in normal
language then JavaScript will allow the user’s speech to be
converted to text on the user’s system itself with the help of web
speech API. Then this text is passed to query synthesizer comprising
of a set of java files which do all the work of extracting keywords
with the help of Stanford Parser Tool.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>After
this, the extracted keywords are matched with the database schema and
finally ranking is done on the generated queries by using various
algorithms. Then the ranked query strings are run on the database and
the output is visible to the user on a web page.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0.14in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>3.2
Use Case Diagram</B></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Title:
Natural Language</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Purpose:
To provide easy access to Enterprise Database.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Overview:
User speaks in natural language and that natural language helps in
providing easy access to Enterprise Database.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Title:
Parser.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Purpose:
To extract parts of speech from the given input sentence.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Overview:
Parser reads the input sentence and processes it and extracts the
parts of speech from the sentence.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Title:
Query.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Purpose:
To retrieve data from the database.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Overview:
After the system generates a query, it is then passed in the database
to fetch data.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Title:
Ranking Query.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Purpose:
To find the best fitting query.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Overview:
System generates multiple queries, and then by ranking them we decide
which one satisfies the user requirements the best and then we put
that query in the database.</FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0.14in; line-height: 150%"><IMG SRC="http://imgur.com/wsrZY1P.png" NAME="Picture 1" ALIGN=BOTTOM WIDTH=600 HEIGHT=888 BORDER=0></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Fig.3
2: Use Case Diagram</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>3.3
Class Diagram </B></FONT></FONT>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-left: -0.2in; margin-bottom: 0in; line-height: 150%; page-break-after: avoid">
<IMG SRC="http://imgur.com/FbhLW8r.png" NAME="Picture 13" ALIGN=BOTTOM WIDTH=638 HEIGHT=508 BORDER=0></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0.14in; line-height: 100%"><FONT COLOR="#4f81bd"><FONT SIZE=2 STYLE="font-size: 9pt"><FONT COLOR="#00000a"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><SPAN STYLE="font-weight: normal">Fig.3
3:Class diagram</SPAN></FONT></FONT></FONT></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
system comprises of 5 bean classes namely Tables, Columns, Values,
ForeignKey, and Query which are used to save the data about the
tables and the keywords used to identify them. The DBHelper class
allows us to handle all the comparison and interfacing required with
the database. It gets a metadata object of the database information
and uses it to compare keywords against the Database schema. The
keyword extractor class uses the POS tagger libraries and generates
the tagged sentence from the user’s input while the QueryGenrator
class handles all the generation processes from the tables and
columns identified from the keywords.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>3.4
Context Level data flow diagram</B></FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><IMG SRC="http://imgur.com/3WsPUZt.png" NAME="Picture 2" ALIGN=BOTTOM WIDTH=598 HEIGHT=171 BORDER=0></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Fig.3
4: Level 0 DFD</FONT></FONT></P>
<TABLE WIDTH=690 CELLPADDING=7 CELLSPACING=0>
	<COL WIDTH=676>
	<TR>
		<TD WIDTH=676 VALIGN=TOP STYLE="border: none; padding: 0in">
			<P ALIGN=CENTER STYLE="margin-left: -0.49in; margin-right: -0.57in">
			<IMG SRC="http://imgur.com/FWlN6CK.png" NAME="Picture 3" ALIGN=BOTTOM WIDTH=682 HEIGHT=377 BORDER=0></P>
		</TD>
	</TR>
</TABLE>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<TABLE WIDTH=602 CELLPADDING=7 CELLSPACING=0>
	<COL WIDTH=588>
	<TR>
		<TD WIDTH=588 VALIGN=TOP STYLE="border: none; padding: 0in">
			<P ALIGN=CENTER STYLE="margin-bottom: 0in"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Fig.3
			5: Level 1 DFD</FONT></FONT></P>
			<P ALIGN=CENTER STYLE="margin-bottom: 0in"><BR>
			</P>
			<P><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The whole flow
			of the process starts with input processing as the name suggests
			is for taking input from the user and processes it using the
			parser. Then comes Query synthesizer phase which consist of query
			generation, ranking the query and applying it on the database. The
			final Output phase is just for the display of the result fetched
			from the database. The result will be put in an html page and
			displayed on a web platform.</FONT></FONT></P>
		</TD>
	</TR>
</TABLE>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>3.5
Component Diagram</B></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-left: -0.29in; margin-bottom: 0in; line-height: 150%">
<IMG SRC="http://imgur.com/FbhLW8r.png" NAME="Picture 7" ALIGN=BOTTOM WIDTH=695 HEIGHT=192 BORDER=0></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<TABLE WIDTH=602 CELLPADDING=7 CELLSPACING=0>
	<COL WIDTH=588>
	<TR>
		<TD WIDTH=588 VALIGN=TOP STYLE="border: none; padding: 0in">
			<P ALIGN=CENTER><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Fig.3
			6 : Component Diagram</FONT></FONT></P>
		</TD>
	</TR>
</TABLE>
<P ALIGN=JUSTIFY STYLE="margin-right: -0.39in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3>The core component
of the system are Database, UI, Query Synthesizer and Speech to Text.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-right: -0.39in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3>In this the Speech
to Text is used so that users can give input in form of a voice based
instruction which can later be processed as a query by extracting the
important parts of speech. The query synthesizer is used to convert
the user input in the form of a query which can be applied on a
database. Database is used on which query will be run down to extract
information. UI is for the users to interact with system easily which
uses a voice based input system.</FONT></FONT><FONT FACE="Times New Roman, serif">
</FONT>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>3.6
Deployment Diagram</B></FONT></FONT></P>
<P STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
whole deployment is divided into three phases which are Input
Processing, Query Synthesizer and displaying the output to user.
Input Processing as the name suggests is for taking input from the
user and process it using the parser. Query synthesizer phase consist
of query generation, ranking the query and applying it on the
database. The final Output phase is just for the display of the
result fetched from the database. The result will be put in an html
page and displayed on a web platform.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><IMG SRC="http://imgur.com/HDvC09P.png" NAME="Picture 4" ALIGN=BOTTOM WIDTH=549 HEIGHT=845 BORDER=0></P>
<TABLE WIDTH=602 CELLPADDING=7 CELLSPACING=0>
	<COL WIDTH=588>
	<TR>
		<TD WIDTH=588 VALIGN=TOP STYLE="border: none; padding: 0in">
			<P ALIGN=CENTER><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Fig.3
			7: Deployment diagram</FONT></FONT></P>
		</TD>
	</TR>
</TABLE>
<P STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>Chapter
- 4</B></FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT COLOR="#111111"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B><SPAN STYLE="background: #ffffff">IMPLEMENTATION</SPAN></B></FONT></FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<OL>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT COLOR="#111111"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B><SPAN STYLE="background: #ffffff">Controller</SPAN></B></FONT></FONT></FONT></P>
</OL>
<P ALIGN=JUSTIFY STYLE="margin-left: 0.3in; margin-bottom: 0in; line-height: 150%">
<FONT COLOR="#111111"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><SPAN STYLE="background: #ffffff">The
controller in our system is a snippet of JavaScript code which
leverages the power of modern web browsers and accept the user inputs
as an audio and converts it to text. This is helpful since our system
is built to run as a server application and so the speech to text
processing can easily be outsourced to the clients device. A major
feature of the web speech API that we used in our system is that it
supports various accents for English and other languages, this not
only saves us the work of training our controller but also allows our
project to be extended in the future to even more languages. The web
speech API is integrated into a user input web page where once the
user is satisfied with his input he can click the submit button and
send the input to the model; this is necessary since speech to text
can sometimes be spotty in its output. The reset button thus allows
the user to restate the input in a better formatted way.</SPAN></FONT></FONT></FONT></P>
<OL START=2>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT COLOR="#111111"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B><SPAN STYLE="background: #ffffff">Model</SPAN></B></FONT></FONT></FONT></P>
</OL>
<P ALIGN=JUSTIFY STYLE="margin-left: 0.3in; margin-bottom: 0in; line-height: 150%">
<FONT COLOR="#111111"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><SPAN STYLE="background: #ffffff">The
model consist of a package of java classes and some libraries stored
on a J2EE deployment war file. So that it can be easily deployed on
enterprise servers. The libraries consist of POS(Part of Speech),
tagging JAR files which we obtain from the Stanford NLP Project. The
advantages of this library is that it handles all the Natural
Language Processing efficiently and provides a string output where
each word in the sentence is tagged with an identifier. The proper
nouns are tagged with a /NN identifier. These proper nouns are taken
as keywords for our projects engine, the rest of the identifiers can
be used in the future to provide a structure score for the generated
queries</SPAN></FONT></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-left: 0.3in; margin-bottom: 0in; line-height: 150%">
<FONT COLOR="#111111"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><SPAN STYLE="background: #ffffff">The
keywords are then piped to an algorithm which compares the keywords
against the database schema and the values stored in the database to
provide a general sense about what the keyword means, if the keyword
of its synonyms are:-</SPAN></FONT></FONT></FONT></P>
<OL>
	<OL TYPE=a>
		<OL TYPE=i>
			<OL>
				<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%">
				<FONT COLOR="#111111"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><SPAN STYLE="background: #ffffff">similar
				to a tables name the user’s desired result might be the tables
				primary key or any of its column the query generated with the
				result as the primary key is ranked higher then the rest of the
				queries generated by this process</SPAN></FONT></FONT></FONT></P>
				<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%">
				<FONT COLOR="#111111"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><SPAN STYLE="background: #ffffff">similar
				to a columns name in which case either the columns entire content
				are assumed to be the desired output or a set of values based on
				the constraints from the other keywords are extracted from the
				columns.</SPAN></FONT></FONT></FONT></P>
				<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%">
				<FONT COLOR="#111111"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><SPAN STYLE="background: #ffffff">The
				same as a value in the database in which case the keyword is
				taken as a constraint such as where a=b; a&gt;b; a&lt;b. </SPAN></FONT></FONT></FONT>
				</P>
			</OL>
		</OL>
	</OL>
</OL>
<P ALIGN=JUSTIFY STYLE="margin-left: 0.3in; margin-bottom: 0in; line-height: 150%">
<FONT COLOR="#111111"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><SPAN STYLE="background: #ffffff">The
tables collected from the above process are then ranked by the number
of relations among them identified using foreign keys, if the foreign
key of a table from our collections points to another table in our
collection it is ranked higher then the tables with the foreign keys
pointing outside the collection. Finally, the tables and column names
except the constrains table are added to a select statement and the
constraints are appended to it. Each combination of such query is
displayed to the user in a ranked manned so as to allow the user to
select the desired query before the rank.</SPAN></FONT></FONT></FONT></P>
<OL START=3>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT COLOR="#111111"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B><SPAN STYLE="background: #ffffff">View</SPAN></B></FONT></FONT></FONT></P>
</OL>
<P ALIGN=JUSTIFY STYLE="margin-left: 0.3in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3>The output to the
user is displayed in the form of webpage which contains the ranked
set of queries from the model and allows the user to select the
desired queries, if the user is unaware of the DSL the first query is
automatically send to the database, since the queries are ranked
there is a good probability that the query which has been run will
produce the desired result.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-left: 0.3in; margin-bottom: 0in; line-height: 150%">
<FONT FACE="Times New Roman, serif"><FONT SIZE=3>The selected query
is sent to the database using a small java file in the model where
the database name and the connection to it can be changed as per the
environment requirements. The output of the query is again added to
the webpage in the view and displayed to the user. If the user is
unsatisfied with the result he is asked to reframe the input and
start the process all over again.</FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>Chapter
– 5</B></FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>RESULT</B></FONT></FONT></P>
<P STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
database we choose for testing our system/platform was a pokemon
database which consisted of every kind of detail about all the
pokemon’s from across the generations, we choose this database
because it has huge amount of data and a large number of relations
due to which it resembles an enterprise deployed database. The
database we selected followed all the normal form of definitions
which is a norm in enterprise application</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%; page-break-after: avoid">
<IMG SRC="http://imgur.com/rpd5XnJ.png" NAME="Picture 14" ALIGN=BOTTOM WIDTH=600 HEIGHT=298 BORDER=0></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0.14in; line-height: 100%"><FONT COLOR="#4f81bd"><FONT SIZE=2 STYLE="font-size: 9pt"><FONT COLOR="#00000a"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><SPAN STYLE="font-weight: normal">Fig.5
1:Controller </SPAN></FONT></FONT></FONT></FONT></FONT>
</P>
<P STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>We
modified the Web speech API Demo given by Google as a sample on the
Google chrome browser product page to include a submit button which
sends the users input to our model</FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%; page-break-after: avoid">
<IMG SRC="http://imgur.com/4L9X3R2.png" NAME="Picture 12" ALIGN=BOTTOM WIDTH=601 HEIGHT=356 BORDER=0></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0.14in; line-height: 100%"><FONT COLOR="#4f81bd"><FONT SIZE=2 STYLE="font-size: 9pt"><FONT COLOR="#00000a"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><SPAN STYLE="font-weight: normal">Fig.5
2:Model </SPAN></FONT></FONT></FONT></FONT></FONT>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Stanford
NLP POS tagger libraries were added to provide identifiers for
keyword in the users input from the controller</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%; page-break-after: avoid">
<IMG SRC="http://imgur.com/N7izY51.png" NAME="Picture 16" ALIGN=BOTTOM WIDTH=620 HEIGHT=69 BORDER=0></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0.14in; line-height: 100%"><FONT COLOR="#4f81bd"><FONT SIZE=2 STYLE="font-size: 9pt"><FONT COLOR="#00000a"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><SPAN STYLE="font-weight: normal">Fig.5
3:Ranked Queries </SPAN></FONT></FONT></FONT></FONT></FONT>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
queries were generated and ranked based on the number of relations in
the used table.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%; page-break-after: avoid">
<IMG SRC="http://imgur.com/CM4VhuY" NAME="Picture 15" ALIGN=BOTTOM WIDTH=502 HEIGHT=150 BORDER=0></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0.14in; line-height: 100%"><FONT COLOR="#4f81bd"><FONT SIZE=2 STYLE="font-size: 9pt"><FONT COLOR="#00000a"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><SPAN STYLE="font-weight: normal">Fig.5
4:Query output </SPAN></FONT></FONT></FONT></FONT></FONT>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
query was run on the used database and the output was 7.</FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>Chapter
- 6</B></FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>LIMITATIONS
AND FUTURE ENHANCEMENTS</B></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><A NAME="_GoBack"></A>
 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>6.1
Limitations</B></FONT></FONT></P>
<OL>
	<LI><P ALIGN=JUSTIFY STYLE="line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
	query generation process takes a lot of time to compare the keywords
	and this time required increases with the size of the database.</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
	engine only works for simple queries. For any complex queries to be
	generated, the description provided by user should be more
	descriptive.</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
	system does not currently support multiple sentences of natural
	language as an input.</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
	structure of the user’s input is not taken into count to generate
	queries with more specificity.</FONT></FONT></P>
</OL>
<P ALIGN=JUSTIFY STYLE="margin-left: 0.5in; line-height: 150%"><BR><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><B>6.2
Future Prospects</B></FONT></FONT></P>
<OL>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
	database can be indexed to replace the keyword comparison time for
	only the initialization of the system.</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Complex
	queries can be processed by using machine learning to ensure better
	generation of queries.</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
	structure of the user’s input when taken into count shall be able
	to include multiple sentences of input and map query keywords to
	database variables.</FONT></FONT></P>
	<LI><P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>A
	REST API can be developed to allow further integration with future
	applications based on our system</FONT></FONT></P>
</OL>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>Chapter
- 7</B></FONT></FONT></P>
<P ALIGN=CENTER STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>CONCLUSION</B></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Availability
of good speech to text APIs are sparse. Google had developed a multi
lingual API but now has stopped support for it and it has since been
deprecated. Other popularly used APIs such as the Voce library do not
support multiple accents and hence could not be used in our platform
without training the library for Indian accent. The Web Speech API is
the one we used in our platform because it fit our requirement of
performing the transformation of speech to text on the user’s
device. It however is not supported on normal java platforms which is
a drawback we did not face.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>The
algorithms provided in papers and from literature review of
previously implemented systems showed that most of such systems are
based on the assumption that the database schema will not change with
propagation from one environment to the other. We thus, developed a
lightweight platform which allowed the system to deployed on all
types of environments or </FONT></FONT>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>Our
system is currently based on simple algorithm of keyword to database
comparison which can be extended to include indexes for database
schema and state (with values). Also, the system can be improved by
using machine learning and generating structure scores for the
generated queries to allow the system to rank the desired query
higher than the others. Also since our system’s main usage is to be
used in various environments, an API to access the functionality will
allow our system to be extended to various new use cases.</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=4><B>References</B></FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT COLOR="#545454"><SPAN STYLE="background: #ffffff">
</SPAN></FONT><BR>
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>[1]
Welcome to Apache OpenNLP, Available from:
&lt;https://opennlp.apache.org/&gt;</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>[2]
Voce: Open Source Speech Interaction, Available from:<A HREF="http://voce.sourceforge.net/">
</A></FONT></FONT><A HREF="http://voce.sourceforge.net/"><FONT COLOR="#1155cc"><FONT FACE="Times New Roman, serif"><FONT SIZE=3><U>http://voce.sourceforge.net/</U></FONT></FONT></FONT></A></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>[3]
Zohar Manna, Richard J. Wildinger, “Toward automatic program
synthesis”, Communications of the ACM, vol 14 issue 3, pp 151-165,
March 1971</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><FONT FACE="Times New Roman, serif"><FONT SIZE=3>[4]
Mohammad Raza, Sumit Gulwani, Natasa Milic-Frayling, “Compositional
Program Synthesis from Natural Language and Examples”, Microsoft
Research Publications, March 2015</FONT></FONT></P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"> 
</P>
<P ALIGN=JUSTIFY STYLE="margin-bottom: 0in; line-height: 150%"><BR>
</P>
<DIV TYPE=FOOTER>
	<P ALIGN=CENTER STYLE="margin-top: 0.46in; margin-bottom: 0in; line-height: 100%">
	<SDFIELD TYPE=PAGE SUBTYPE=RANDOM FORMAT=PAGE>10</SDFIELD></P>
	<P STYLE="margin-bottom: 0in; line-height: 100%"><BR>
	</P>
</DIV>
</BODY>
</HTML>
