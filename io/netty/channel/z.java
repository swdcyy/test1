package io.netty.channel.z;
import io.netty.channel.s;
import io.netty.channel.d;
import yqd.e;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.netty.channel.e;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.concurrent.f;

public final class z extends s	// class@0010d3
{
    public final Throwable d;

    public void z(d p0,e p1,Throwable p2){
       super(p0, p1);
       Objects.requireNonNull(p2, "cause");
       this.d = p2;
    }
    public e e(){
       PlatformDependent.H(this.d);
       return this;
    }
    public f e(){
       this.e();
       return this;
    }
    public boolean isSuccess(){
       return false;
    }
    public e k(){
       PlatformDependent.H(this.d);
       return this;
    }
    public f k(){
       this.k();
       return this;
    }
    public Throwable z(){
       return this.d;
    }
}
