public aspect Logger {
    pointcut publicOperation() : execution(public * *.*(..));
    Object around() : publicOperation() {
        long start = System.nanoTime();
        Object ret = proceed();
        long end = System.nanoTime();
        System.out.println( "Method : [" + thisJoinPoint.getSignature()
                    + "] took [" + (end-start) + "] nanoseconds");
            return ret;
        }
    }
