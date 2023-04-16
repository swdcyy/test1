package k2b.d;
import k2b.x;
import com.google.common.collect.ImmutableList;
import java.lang.String;
import com.google.gson.JsonElement;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d extends x	// class@001b93
{
    public final String activityTag;
    public final JsonElement csLogCorrelateInfo;
    public final ImmutableList entryTag;
    public final String ip;
    public final int isBackground;
    public final String isHorizontal;
    public final String isPad;
    public final String processName;

    public void d(ImmutableList p0,String p1,String p2,String p3,int p4,JsonElement p5,String p6,String p7){
       super();
       this.entryTag = p0;
       this.activityTag = p1;
       this.processName = p2;
       Objects.requireNonNull(p3, "Null ip");
       this.ip = p3;
       this.isBackground = p4;
       this.csLogCorrelateInfo = p5;
       this.isPad = p6;
       this.isHorizontal = p7;
    }
    public String a(){
       return this.activityTag;
    }
    public JsonElement c(){
       return this.csLogCorrelateInfo;
    }
    public ImmutableList d(){
       return this.entryTag;
    }
    public String e(){
       return this.ip;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof x) {
          return false;
       }
       d tentryTag = this.entryTag;
       if (tentryTag == null) {
          if (p0.d() == null) {
          label_0033 :
             tentryTag = this.activityTag;
             if (tentryTag == null) {
                if (p0.a() != null) {
                label_00b1 :
                   b = false;
                label_00b2 :
                   return b;
                }
             }else if(tentryTag.equals(p0.a())){
             }
             tentryTag = this.processName;
             if (tentryTag == null) {
                if (p0.i() != null) {
                }
             }else if(tentryTag.equals(p0.i())){
             }
             if ((this.ip).equals(p0.e()) && this.isBackground == p0.f()) {
                tentryTag = this.csLogCorrelateInfo;
                if (tentryTag == null) {
                   if (p0.c() != null) {
                   }
                }else if(tentryTag.equals(p0.c())){
                }
                tentryTag = this.isPad;
                if (tentryTag == null) {
                   if (p0.h() != null) {
                   }
                }else if(tentryTag.equals(p0.h())){
                }
                tentryTag = this.isHorizontal;
                if (tentryTag == null) {
                   if (p0.g() == null) {
                      goto label_00b2 ;
                   }else {
                      goto label_00b1 ;
                   }
                }else if(tentryTag.equals(p0.g())){
                   goto label_00b2 ;
                }else {
                   goto label_00b1 ;
                }
             }else {
                goto label_00b1 ;
             }
          }else {
             goto label_00b1 ;
          }
       }else if(tentryTag.equals(p0.d())){
          goto label_0033 ;
       }else {
          goto label_00b1 ;
       }
    }
    public int f(){
       return this.isBackground;
    }
    public String g(){
       return this.isHorizontal;
    }
    public String h(){
       return this.isPad;
    }
    public int hashCode(){
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.entryTag;
       int i = 0;
       int i1 = (obj == null)? 0: obj.hashCode();
       int i2 = 0xf4243;
       i1 = (i1 ^ i2) * i2;
       d tactivityTag = this.activityTag;
       int i3 = (tactivityTag == null)? 0: tactivityTag.hashCode();
       i1 = (i1 ^ i3) * i2;
       tactivityTag = this.processName;
       i3 = (tactivityTag == null)? 0: tactivityTag.hashCode();
       i1 = (((((i1 ^ i3) * i2) ^ (this.ip).hashCode()) * i2) ^ this.isBackground) * i2;
       tactivityTag = this.csLogCorrelateInfo;
       i3 = (tactivityTag == null)? 0: tactivityTag.hashCode();
       i1 = (i1 ^ i3) * i2;
       tactivityTag = this.isPad;
       i3 = (tactivityTag == null)? 0: tactivityTag.hashCode();
       i1 = (i1 ^ i3) * i2;
       d tisHorizonta = this.isHorizontal;
       if (tisHorizonta != null) {
          i = tisHorizonta.hashCode();
       }
       return (i1 ^ i);
    }
    public String i(){
       return this.processName;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GlobalAttr{entryTag="+this.entryTag+", activityTag="+this.activityTag+", processName="+this.processName+", ip="+this.ip+", isBackground="+this.isBackground+", csLogCorrelateInfo="+this.csLogCorrelateInfo+", isPad="+this.isPad+", isHorizontal="+this.isHorizontal+"}";
    }
}
