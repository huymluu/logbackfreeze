# logbackfreeze

## CASE 1: SUCCESS case
- Run `ChildProcess.main()`

-> Will create 1000 threads, SUCCESS print log to file + console



## CASE 2: FAILED case
- Run `ParentProcess.main()`

(`ParentProcess` creates `ChildProcess`, then `ChildProcess` creates threads same as above)

-> **App FREEZE here**: `ChildProcess` just creates LESS than 1000 threads (randomly 300, 400,...) , and freeze (check log)
