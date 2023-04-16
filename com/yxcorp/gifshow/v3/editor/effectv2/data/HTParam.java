package com.yxcorp.gifshow.v3.editor.effectv2.data.HTParam;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.effectv2.data.HTMusicRange;
import com.yxcorp.gifshow.v3.editor.effectv2.data.HTTextDefaultPosition;
import com.yxcorp.gifshow.v3.editor.effectv2.data.HTTextParam;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Number;
import java.lang.StringBuilder;

public final class HTParam	// class@000f48
{
    public final String actionMode;
    public final double defaultTime;
    public final String fontId;
    public final HTMusicRange musicRange;
    public final HTTextDefaultPosition textDefaultPosition;
    public final HTTextParam textParam;

    public void HTParam(){
       super(null, null, null, null, null, 0, 63, null);
    }
    public void HTParam(String p0,String p1,HTMusicRange p2,HTTextDefaultPosition p3,HTTextParam p4,double p5,int p6,u p7){
       int i = this;
       u ou = null;
       String str = "";
       String str1 = (p6 & 0x01)? str: ou;
       if (!(p6 & 0x02)) {
          str = ou;
       }
       if (p6 & 0x04) {
          HTMusicRange hTMusicRange = new HTMusicRange(0, 0, 3, null);
       }else {
          u ou1 = ou;
       }
       HTTextDefaultPosition hTTextDefaul = (p6 & 0x08)? new HTTextDefaultPosition(0, 0, 3, ou): ou;
       if (p6 & 0x10) {
          HTTextParam hTTextParam = new HTTextParam(0, 0, 0, 0, 0, 31, null);
       }
       double d = (p6 & 0x20)? 3.00f: p5;
       a.p(str1, "actionMode");
       a.p(str, "fontId");
       a.p(v4, "musicRange");
       a.p(hTTextDefaul, "textDefaultPosition");
       a.p(ou, "textParam");
       super();
       i.actionMode = str1;
       i.fontId = str;
       i.musicRange = v4;
       i.textDefaultPosition = hTTextDefaul;
       i.textParam = ou;
       i.defaultTime = d;
       return;
    }
    public final String a(){
       return this.actionMode;
    }
    public final String b(){
       return this.fontId;
    }
    public final HTMusicRange c(){
       return this.musicRange;
    }
    public final HTTextDefaultPosition d(){
       return this.textDefaultPosition;
    }
    public final HTTextParam e(){
       return this.textParam;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HTParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof HTParam && (a.g(this.actionMode, p0.actionMode) && (a.g(this.fontId, p0.fontId) && (a.g(this.musicRange, p0.musicRange) && (a.g(this.textDefaultPosition, p0.textDefaultPosition) && (a.g(this.textParam, p0.textParam) && !Double.compare(this.defaultTime, p0.defaultTime)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       HTParam obj = PatchProxy.apply(null, this, HTParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.actionMode;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       HTParam tfontId = this.fontId;
       int i2 = (tfontId != null)? tfontId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tfontId = this.musicRange;
       i2 = (tfontId != null)? tfontId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tfontId = this.textDefaultPosition;
       i2 = (tfontId != null)? tfontId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tfontId = this.textParam;
       if (tfontId != null) {
          i = tfontId.hashCode();
       }
       long l = Double.doubleToLongBits(this.defaultTime);
       return (((i1 + i) * 31) + (int)(l ^ (l >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HTParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HTParam\(actionMode=\'"+this.actionMode+"\', fontId=\'"+this.fontId+"\', musicRange="+this.musicRange+", textDefaultPosition="+this.textDefaultPosition+", defaultTime:"+this.defaultTime+')';
    }
}
