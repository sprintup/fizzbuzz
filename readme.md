This is my first time programming in Java, so I did some things differently than I would with a language and tools I'm more familiar with. Further, I'm not sure exectly what is mean by 'Upload as a separate project' as it could either be a difference in package, repository or something I don't know. I'm just going to build it the way I normally would.  

1. The [first step](https://github.com/sprintup/fizzbuzz/commit/252882ba6b2a5809b56bedd13929f0e17ed13099) was done without Maven, I was just using command line and IntelliJ IDE. Therefor, the two paths to fizzbuzz from the root directory are not attached to a project in the sense they don't have a POM file. These can be deleted, but I thought maybe you would want to see them.
More details are [here](https://github.com/sprintup/fizzbuzz/blob/252882ba6b2a5809b56bedd13929f0e17ed13099/test/com/adaction/fizzbuzz/Step_1_Tests.java#L81).  

   I understand how the pom file is important to configuring microservices, so before the second step, I followed: 
https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

   [Here](https://github.com/sprintup/fizzbuzz/commit/30267efb44c746978d54b2c4ce287e3591b7a294) are the changes before step 2.

2. For step 2, I just copied the code from step 1 into the new Maven project (my-app) 

3. For step 3, I'll check out a new branch and submit a pull request. 