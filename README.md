# arthasDemo
this repo is a note book of learning arthas, an online Java diagnostic tool

##### [watch](#https://alibaba.github.io/arthas/watch.html)

> watch <package.className> <method_patern> "{params,target,returnObj}" <condition_expression>

* condition_expression

  * -b befor the method is invoked

  * -s after the method is invoked

  * -e after the exception happens

  * -x the depth of output field, default 1

  * -n monitor times

* params

   input params

* target

  fields of one class

* returnObj

  the output param

expamples:

```
$ watch com.example.demo.service.TestService testService "{params,target,returnObj}" -x 3
```

output:

```
Press Q or Ctrl+C to abort.
Affect(class count: 1 , method count: 1) cost in 83 ms, listenerId: 1
ts=2020-07-29 21:53:27; [cost=1.4186ms] result=@ArrayList[
    @Object[][
        @String[inputSomethingPrivate],
    ],
    @TestService[
        filed=@Integer[1],
    ],
    @String[output something private],
]
```



this tool can monitor private methods

