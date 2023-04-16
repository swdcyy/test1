package com.yxcorp.gifshow.upload.m;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.bean.ContactInfo;
import zq4.a;
import zq4.b;
import brd.t;
import com.yxcorp.gifshow.upload.r;

public final class m implements o	// class@001e90
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final Object apply(Object p0){
       if (p0 != null) {
          ContactInfo mUserAddress = p0.mUserAddressBook;
          if (mUserAddress != null) {
             a a = mUserAddress.a;
             if (a != null) {
                int len = a.length;
                int i = 0;
                while (i < len) {
                   object oobject = a[i];
                   if (oobject != null) {
                      oobject.a = "";
                   }
                   i = i + 1;
                }
             }
          }
       }
       return r.d(p0);
    }
}
