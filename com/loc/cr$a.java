package com.loc.cr$a;
import java.lang.Object;
import java.util.ArrayList;
import com.loc.dr;
import com.loc.dt;
import com.loc.ds;
import com.loc.du;
import com.loc.dv;
import java.util.List;
import java.lang.String;
import java.util.Collection;
import java.util.Iterator;
import java.lang.StringBuilder;

public final class cr$a	// class@0013c7
{
    public byte a;
    public String b;
    public dr c;
    public dr d;
    public dr e;
    public List f;
    public List g;

    public void cr$a(){
       super();
       this.f = new ArrayList();
       this.g = new ArrayList();
    }
    public static boolean a(dr p0,dr p1){
       if (p0 == null || p1 == null) {
          int i = (p0 == null)? 1: 0;
          int i1 = (p1 == null)? 1: 0;
          if (i == i1) {
             return true;
          }else {
             return false;
          }
       }else if(p0 instanceof dt && p1 instanceof dt){
          if (p0.j == p1.j && p0.k == p1.k) {
             return true;
          }
          return false;
       }else if(p0 instanceof ds && p1 instanceof ds){
          if (p0.l == p1.l && (p0.k == p1.k && p0.j == p1.j)) {
             return true;
          }
          return false;
       }else if(p0 instanceof du && p1 instanceof du){
          if (p0.j == p1.j && p0.k == p1.k) {
             return true;
          }
          return false;
       }else if(p0 instanceof dv && (p1 instanceof dv && (p0.j == p1.j && p0.k == p1.k))){
          return true;
       }else {
          return false;
       }
    }
    public final void a(){
       this.a = 0;
       this.b = "";
       this.c = null;
       this.d = null;
       this.e = null;
       this.f.clear();
       this.g.clear();
    }
    public final void a(byte p0,String p1,List p2){
       this.a();
       this.a = p0;
       this.b = p1;
       if (p2 != null) {
          this.f.addAll(p2);
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             dr uodr = iterator.next();
             dr i = uodr.i;
             if (i == null && uodr.h != null) {
                this.d = uodr;
             }else if(i != null && uodr.h != null){
                this.e = uodr;
             }
          }
       }
       cr$a td = this.d;
       if (td == null) {
          td = this.e;
       }
       this.c = td;
       return;
    }
    public final String toString(){
       return "CellInfo{radio="+this.a+", operator=\'"+this.b+'''+", mainCell="+this.c+", mainOldInterCell="+this.d+", mainNewInterCell="+this.e+", cells="+this.f+", historyMainCellList="+this.g+'}';
    }
}
