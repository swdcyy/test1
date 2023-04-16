package com.kwai.eve.blockdata.MetaInfo;
import com.kwai.eve.blockdata.MetaInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.eve.blockdata.BlockDataException;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import msd.l;
import kotlin.collections.ArraysKt___ArraysKt;

public final class MetaInfo	// class@000dcd
{
    public String extra;
    public String name;
    public int[] shape;
    public int status;
    public int type;
    public static final MetaInfo$a Companion;

    static {
       MetaInfo.Companion = new MetaInfo$a(null);
    }
    public void MetaInfo(String p0){
       a.p(p0, "metaStr");
       super();
       this.name = "";
       this.type = -1;
       int[] ointArray = new int[0];
       this.shape = ointArray;
       this.extra = "";
       this.status = -1;
       String[] stringArray = new String[]{"|"};
       List list = StringsKt__StringsKt.H4(p0, stringArray, false, 0, 6, null);
       if (list.size() != 4) {
          this.status = -11004;
          return;
       }else {
          try{
             this.name = list.get(0);
             this.type = Integer.parseInt(list.get(1));
             stringArray = new String[]{"*"};
             List list1 = StringsKt__StringsKt.H4(list.get(2), stringArray, false, 0, 6, null);
             ArrayList uArrayList = new ArrayList(u.Y(list1, 10));
             Iterator iterator = list1.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(Integer.valueOf(Integer.parseInt(iterator.next())));
             }
             this.shape = CollectionsKt___CollectionsKt.F5(uArrayList);
             this.extra = list.get(3);
             this.status = 0;
          }catch(java.lang.Exception e0){
             this.status = -11004;
          }
          return;
       }
    }
    public void MetaInfo(String p0,int p1,int[] p2,String p3){
       a.p(p0, "name");
       a.p(p2, "shape");
       a.p(p3, "extra");
       super();
       this.name = "";
       this.type = -1;
       int[] ointArray = new int[0];
       this.shape = ointArray;
       this.extra = "";
       this.status = -1;
       String str = "|";
       if (!StringsKt__StringsKt.O2(p0, str, 0, 2, null) && !StringsKt__StringsKt.O2(p3, str, 0, 2, null)) {
          if (p1 >= 1 && p1 <= 4) {
             if (this.shapeCheck(p2)) {
                this.name = p0;
                this.type = p1;
                this.shape = p2;
                this.extra = p3;
                this.status = 0;
                return;
             }else {
                this.status = -11002;
                throw new BlockDataException("BlockData param invalid: shape invalid");
             }
          }else {
             this.status = -11001;
             throw new BlockDataException("BlockData param invalid: data type invalid: "+p1);
          }
       }else {
          this.status = -11004;
          throw new BlockDataException("BlockData param invalid: name or extra can\'t contain \'|\'");
       }
    }
    public final String getExtra$luascriptcore_release(){
       return this.extra;
    }
    public final String getMetaInfo$luascriptcore_release(){
       String obj = PatchProxy.apply(null, this, MetaInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.name+"|"+this.type+"|"+ArraysKt___ArraysKt.Eg(this.shape, "*", null, null, 0, null, null, 62, null)+"|"+this.extra;
       a.o(obj, "StringBuilder\(\)\n      .a¡­\(extra\)\n      .toString\(\)");
       return obj;
    }
    public final String getName$luascriptcore_release(){
       return this.name;
    }
    public final int[] getShape$luascriptcore_release(){
       return this.shape;
    }
    public final int getStatus$luascriptcore_release(){
       return this.status;
    }
    public final int getType$luascriptcore_release(){
       return this.type;
    }
    public final void setExtra$luascriptcore_release(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MetaInfo.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.extra = p0;
       return;
    }
    public final void setName$luascriptcore_release(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MetaInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.name = p0;
       return;
    }
    public final void setShape$luascriptcore_release(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MetaInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.shape = p0;
       return;
    }
    public final void setStatus$luascriptcore_release(int p0){
       this.status = p0;
    }
    public final void setType$luascriptcore_release(int p0){
       this.type = p0;
    }
    public final boolean shapeCheck(int[] p0){
       int i = (!p0.length)? 1: 0;
       if (i) {
          return false;
       }else {
          long l = 1;
          i = p0.length;
          int i1 = 0;
          while (true) {
             if (i1 >= i) {
                return true;
             }
             if (p0[i1] <= 0) {
                break ;
             }else {
                l = l * (long)p0[i1];
                if (l - (long)Integer.MAX_VALUE > 0) {
                   return false;
                }else {
                   i1 = i1 + 1;
                }
             }
          }
          return false;
       }
    }
}
