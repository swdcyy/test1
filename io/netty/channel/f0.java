package io.netty.channel.f0;
import lqd.m;
import io.netty.util.concurrent.m;
import lqd.n;
import java.util.concurrent.Executor;
import yqd.f;
import io.netty.channel.t;
import yqd.e;
import yqd.a;
import io.netty.channel.d;
import io.netty.channel.r;
import io.netty.channel.e;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.netty.channel.d$a;
import io.netty.channel.w;
import lqd.f;
import java.lang.Runnable;
import io.netty.channel.f0$a;

public abstract class f0 extends m implements m	// class@001096
{
    public final f A;

    public void f0(n p0,Executor p1,boolean p2){
       super(p0, p1, p2);
       this.A = new t(this);
    }
    public n J(){
       return this.b;
    }
    public f J(){
       return this.b;
    }
    public e K0(d p0,r p1){
       Objects.requireNonNull(p0, "channel");
       Objects.requireNonNull(p1, "promise");
       p0.W3().i0(this, p1);
       return p1;
    }
    public e O3(d p0){
       w ow = new w(p0, this);
       this.K0(p0, ow);
       return ow;
    }
    public f Y3(){
       return this.A;
    }
    public boolean c0(Runnable p0){
       return (p0 instanceof f0$a ^ 0x01);
    }
    public m next(){
       return this;
    }
    public e next(){
       return this;
    }
}
