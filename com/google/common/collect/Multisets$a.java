package com.google.common.collect.Multisets$a;
import com.google.common.collect.k$a;
import java.lang.Object;
import ok.k;
import java.lang.String;
import java.lang.StringBuilder;

public abstract class Multisets$a implements k$a	// class@00185e
{

    public void Multisets$a(){
       super();
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof k$a && (this.getCount() == p0.getCount() && k.a(this.getElement(), p0.getElement()))) {
          b = true;
       }
    label_0020 :
       return b;
    }
    public int hashCode(){
       Object element = this.getElement();
       int i = (element == null)? 0: element.hashCode();
       return (i ^ this.getCount());
    }
    public String toString(){
       String str = String.valueOf(this.getElement());
       int count = this.getCount();
       if (count == 1) {
       }else {
          str = str+" x "+count;
       }
       return str;
    }
}
