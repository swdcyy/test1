package com.yxcorp.retrofit.cdn.CdnHostGroup;
import java.io.Serializable;
import com.yxcorp.retrofit.cdn.CdnHostGroup$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import java.lang.Iterable;
import bjd.b;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.u;
import kotlin.Pair;
import java.lang.Integer;
import qrd.r0;
import java.lang.Number;
import java.lang.StringBuilder;
import mjd.b;
import java.util.Collection;

public final class CdnHostGroup implements Serializable	// class@00095b
{
    public List hostList;
    public String id;
    public boolean isPredefined;
    public int mHeadPosition;
    public String typeName;
    public String version;
    public static final CdnHostGroup$a Companion;

    static {
       CdnHostGroup.Companion = new CdnHostGroup$a(null);
    }
    public void CdnHostGroup(String p0,String p1,List p2,String p3,boolean p4){
       Object obj5;
       boolean b;
       int i = this;
       ArrayList obj = p0;
       Random obj1 = p1;
       Object obj2 = p2;
       ArrayList obj3 = p3;
       a.q(obj, "id");
       a.q(obj1, "typeName");
       a.q(obj2, "hostList");
       a.q(obj3, "version");
       super();
       i.id = "";
       i.typeName = "";
       i.hostList = CollectionsKt__CollectionsKt.E();
       i.version = "";
       i.id = obj;
       i.typeName = obj1;
       i.version = obj3;
       obj = new ArrayList();
       obj1 = new Random();
       obj3 = new ArrayList();
       Iterator iterator = p2.iterator();
       int i1 = 1;
       while (iterator.hasNext()) {
          Object obj4 = iterator.next();
          if (obj4.a() <= 0) {
             i1 = 0;
          }
          if (i1) {
             obj3.add(obj4);
          }
       }
       Set set = CollectionsKt___CollectionsKt.K5(obj3);
       int i2 = set.size();
       int i3 = 0;
       int i4 = 10;
       while (i3 < i2) {
          ArrayList uArrayList = new ArrayList(u.Y(set, i4));
          Iterator iterator1 = set.iterator();
          int i5 = 0;
          while (iterator1.hasNext()) {
             b uob = iterator1.next();
             int i6 = uob.a() + i5;
             uArrayList.add(r0.a(new Pair(Integer.valueOf(i5), Integer.valueOf(i6)), uob));
             i5 = i6;
          }
          i4 = obj1.nextInt(i5) + i1;
          Iterator iterator2 = uArrayList.iterator();
          while (true) {
             if (iterator2.hasNext()) {
                obj5 = iterator2.next();
                Pair pair = obj5.component1();
                b = (pair.getFirst().intValue() < i4 && i4 <= pair.getSecond().intValue())? true: false;
                if (!b) {
                   continue ;
                }
             }else {
                obj5 = null;
             }
             if (obj5 != null) {
                b second = obj5.getSecond();
                if (second != null) {
                   obj.add(second);
                   set.remove(second);
                }
             }
             i3 = i3 + 1;
          }
       }
       if (obj.size() != p2.size()) {
          b.a(2, "KwaiCdnHostGroup", "Some hosts can\'t be added."+" rawCdnHostList: "+obj2+", resultHostList: "+obj);
       }
       ArrayList uArrayList1 = new ArrayList(u.Y(obj, i4));
       Iterator iterator3 = obj.iterator();
       while (iterator3.hasNext()) {
          uArrayList1.add(iterator3.next().a);
       }
       i.hostList = uArrayList1;
       i.isPredefined = p4;
       return;
    }
    public final List getAllHosts(){
       ArrayList uArrayList = new ArrayList();
       int i = this.hostList.size();
       int i1 = 0;
       while (i1 < i) {
          int i2 = this.mHeadPosition + i1;
          i2 = i2 % i;
          String str = CollectionsKt___CollectionsKt.F2(this.hostList, i2);
          if (str != null) {
             uArrayList.add(str);
          }
          i1 = i1 + 1;
       }
       return uArrayList;
    }
    public final String getHost(){
       return CollectionsKt___CollectionsKt.F2(this.hostList, this.mHeadPosition);
    }
    public final List getHostList(){
       return this.hostList;
    }
    public final String getId(){
       return this.id;
    }
    public final String getTypeName(){
       return this.typeName;
    }
    public final String getVersion(){
       return this.version;
    }
    public final boolean isPredefined(){
       return this.isPredefined;
    }
    public final boolean nextHost(){
       CdnHostGroup tmHeadPositi = this.mHeadPosition;
       CdnHostGroup thostList = this.hostList;
       int i = 1;
       if (thostList.isEmpty() ^ i) {
       }else {
          thostList = null;
       }
       if (thostList != null) {
          this.mHeadPosition = (this.mHeadPosition + i) % thostList.size();
       }
       if (this.mHeadPosition == tmHeadPositi) {
          i = false;
       }
       return i;
    }
    public String toString(){
       return "KwaiCdnHostGroup\(id=\'"+this.id+"\', typeName=\'"+this.typeName+"\', "+"hostList="+this.hostList+", version=\'"+this.version+"\', "+"isPredefined="+this.isPredefined+", mHeadPosition="+this.mHeadPosition+')';
    }
}
