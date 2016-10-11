# logbackfreeze

## CASE 1: SUCCESS case
- Run `ChildProcess.main()`

-> Will print 1000 log to console



## CASE 2: FAILED case
- Run `ParentProcess.main()`

(`ParentProcess` creates `ChildProcess`, then `ChildProcess` run same as above)

-> **App FREEZE here**
