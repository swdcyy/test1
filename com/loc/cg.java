package com.loc.cg;
import java.lang.Object;
import java.lang.Math;

public abstract class cg	// class@0013b8
{
    public cg c;

    public void cg(){
       super();
    }
    public void cg(cg p0){
       this.c = p0;
    }
    public void a(int p0){
       cg tc = this.c;
       if (tc != null) {
          tc.a(p0);
       }
       return;
    }
    public void a(boolean p0){
       cg tc = this.c;
       if (tc != null) {
          tc.a(p0);
       }
       return;
    }
    public abstract boolean a();
    public int b(){
       cg tc = this.c;
       int i = (tc != null)? tc.b(): Integer.MAX_VALUE;
       return Math.min(Integer.MAX_VALUE, i);
    }
    public final boolean c(){
       cg tc = this.c;
       boolean b = (tc != null)? tc.c(): true;
       if (!b) {
          return false;
       }else {
          return this.a();
       }
    }
}
