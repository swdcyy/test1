package com.airbnb.lottie.ex.model.content.MergePaths;
import i5.b;
import java.lang.String;
import com.airbnb.lottie.ex.model.content.MergePaths$MergePathsMode;
import java.lang.Object;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import c5.c;
import a5.d;
import c5.l;
import java.lang.StringBuilder;

public class MergePaths implements b	// class@000dad
{
    public final String a;
    public final MergePaths$MergePathsMode b;
    public final boolean c;

    public void MergePaths(String p0,MergePaths$MergePathsMode p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public c a(f p0,a p1){
       if (p0.n != null) {
          return new l(this);
       }
       d.c("Animation contains merge paths but they are disabled.");
       return null;
    }
    public String b(){
       return this.a;
    }
    public String toString(){
       return "MergePaths{mode="+this.b+'}';
    }
}
