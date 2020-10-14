* This is my first time programming in Java, so I did some things differently than I would with a language and tools I'm more familiar with. 
* I'm not sure exectly what is mean by 'Upload as a separate project' as it could either be a difference in package, repository or something I don't know. I'm just going to build it the way I normally would.  
* In case you wanted to run the code at specific points in time (different steps), there is a [`git pull --unshallow` link](https://git-scm.com/docs/git-fetch#Documentation/git-fetch.txt---unshallow) that I have not tried before, but might work. Also, I made a separate branch for step 2.
* I was confused as to how the array of integers would be passed, so I just went with the default implementation of an array of strings that could be ints. With more information I could implement exception messages or type checking. I assumed arguments would be passed as strings from the command line.
1. The [first step](https://github.com/sprintup/fizzbuzz/commit/252882ba6b2a5809b56bedd13929f0e17ed13099) was done without Maven, I was just using command line and IntelliJ IDE. Therefor, the two paths to fizzbuzz from the root directory are not attached to a project in the sense they don't have a POM file. These can be deleted, but I thought maybe you would want to see them.
More details are [here](https://github.com/sprintup/fizzbuzz/blob/252882ba6b2a5809b56bedd13929f0e17ed13099/test/com/adaction/fizzbuzz/Step_1_Tests.java#L81).  

   I understand how the pom file is important to configuring microservices, so before the second step, I followed: 
https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

   [Here](https://github.com/sprintup/fizzbuzz/commit/30267efb44c746978d54b2c4ce287e3591b7a294) are the changes before step 2.

2. For [step 2](https://github.com/sprintup/fizzbuzz/commit/15638e5427702728575b977f89d290f3072cd814), I just copied the code from step 1 into the new Maven project (my-app) 
     

3. Step 3
   * I'm not sure if the 'output' is the return value or the side-effect (log). Both are possible, but implementation is different. I'm going assume it's the log, since machines wouldn't be able to read reports very easily. Further, to have it in the right order (oneline for array, then the report) I'm going to ask the project manager if it makes a difference to the end user. 
   * The hashtable works, but there is something wrong with the test, where it is only showing the integer. More familiarity with java would help, but it could be it could be something with the testing framework too, since the correct string is printed just before the return. It could be that I'm passing multiple integers with a space as a delimiter. This is something I would document and bring up in code review, it's documented in [issue #3](https://github.com/sprintup/fizzbuzz/issues/3).
   
   ### Final Result
   ![Output from step 3](https://github.com/sprintup/fizzbuzz/blob/master/Screenshot_ConsoleOutput.png?raw=true)   