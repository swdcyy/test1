package io.netty.channel.s;
import io.netty.channel.e;
import io.netty.util.concurrent.c;
import io.netty.channel.d;
import yqd.e;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.netty.util.concurrent.f;
import io.netty.util.concurrent.g;
import io.netty.util.concurrent.DefaultPromise;
import lqd.m;

public abstract class s extends c implements e	// class@0010af
{
    public final d c;

    public void s(d p0,e p1){
       super(p1);
       Objects.requireNonNull(p0, "channel");
       this.c = p0;
    }
    public Object A(){
       return null;
    }
    public e c(){
       return this;
    }
    public f c(){
       return this;
    }
    public e e(){
       return this;
    }
    public f e(){
       return this.e();
    }
    public e f(g p0){
       super.f(p0);
       return this;
    }
    public f f(g p0){
       this.f(p0);
       return this;
    }
    public e g(g[] p0){
       Objects.requireNonNull(p0, "listeners");
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          if (oobject == null) {
             break ;
          }else {
             DefaultPromise.y0(this.o0(), this, oobject);
          }
       }
       return this;
    }
    public f g(g[] p0){
       Objects.requireNonNull(p0, "listeners");
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          if (oobject == null) {
             break ;
          }else {
             DefaultPromise.y0(this.o0(), this, oobject);
          }
       }
       return this;
    }
    public e h(g[] p0){
       return this;
    }
    public f h(g[] p0){
       return this;
    }
    public e i(g p0){
       return this;
    }
    public f i(g p0){
       return this;
    }
    public e j(){
       return this;
    }
    public f j(){
       return this;
    }
    public e k(){
       return this;
    }
    public f k(){
       return this.k();
    }
    public d o(){
       return this.c;
    }
    public e o0(){
       e uoe = super.o0();
       if (uoe == null) {
          uoe = this.o().F3();
       }
       return uoe;
    }
    public boolean v(){
       return false;
    }
}
