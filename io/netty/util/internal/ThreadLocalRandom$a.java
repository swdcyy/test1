package io.netty.util.internal.ThreadLocalRandom$a;
import java.lang.Thread;
import java.lang.String;
import java.security.SecureRandom;
import java.lang.System;
import io.netty.util.internal.ThreadLocalRandom;
import java.lang.Object;
import java.util.concurrent.BlockingQueue;

public final class ThreadLocalRandom$a extends Thread	// class@00111f
{

    public void ThreadLocalRandom$a(String p0){
       super(p0);
    }
    public void run(){
       ThreadLocalRandom.seedGeneratorEndTime = System.nanoTime();
       ThreadLocalRandom.seedQueue.add(new SecureRandom().generateSeed(8));
    }
}
