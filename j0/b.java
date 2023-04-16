package j0.b;
import aegon.chrome.net.g;
import java.lang.String;
import aegon.chrome.net.q$b;
import java.util.concurrent.Executor;
import aegon.chrome.net.q$a;
import aegon.chrome.net.h$a;
import j0.n;
import aegon.chrome.net.b$b;
import java.util.List;
import java.util.Collection;
import aegon.chrome.net.f;
import aegon.chrome.net.n$a;
import j0.m;

public abstract class b extends g	// class@001992
{

    public void b(){
       super();
    }
    public q$a d(String p0,q$b p1,Executor p2){
       return this.j(p0, p1, p2);
    }
    public h$a j(String p0,q$b p1,Executor p2){
       return new n(p0, p1, p2, this);
    }
    public abstract f l(String p0,b$b p1,Executor p2,String p3,List p4,int p5,boolean p6,Collection p7,boolean p8,int p9,boolean p10,int p11);
    public abstract m m(String p0,q$b p1,Executor p2,int p3,Collection p4,boolean p5,boolean p6,boolean p7,boolean p8,int p9,boolean p10,int p11,n$a p12,int p13);
}
