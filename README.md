# Project 3 Proxy Pattern
COMP 473

Henry Remache

Stephanie Verlingo

##Problem Solved by Proxy Pattern:
The proxy pattern is used for several reasons: 
  1. It is useful if creating any objects would be expensive, or require a lot of memory.
  2. Also useful if the initialization is expensive as well.
  3. Allows for reduction of cost of accessing objects.

We implemented a project using proxy pattern to reduct the cost of loading videos. A RealVideo would require
a large amount of memory to initialize. A ProxyVideo is created to reduce the load of initializing a new 
video. Only when user wants to play the video is the actaul RealVideoloaded. Otherwise we avoid loading 
the video with the initialization of a ProxyVideo.
