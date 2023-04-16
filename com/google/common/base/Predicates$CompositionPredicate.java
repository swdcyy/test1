package com.google.common.base.Predicates$CompositionPredicate;
import ok.o;
import java.io.Serializable;
import ok.h;
import com.google.common.base.Predicates$a;
import java.lang.Object;
import ok.n;
import java.lang.String;
import java.lang.StringBuilder;

public class Predicates$CompositionPredicate implements o, Serializable	// class@001721
{
    public final h f;
    public final o p;
    public static final long serialVersionUID;

    public void Predicates$CompositionPredicate(o p0,h p1,Predicates$a p2){
       super();
       n.j(p0);
       this.p = p0;
       n.j(p1);
       this.f = p1;
    }
    public boolean apply(Object p0){
       return this.p.apply(this.f.apply(p0));
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof Predicates$CompositionPredicate && (this.f.equals(p0.f) && this.p.equals(p0.p))) {
          b = true;
       }
    label_001c :
       return b;
    }
    public int hashCode(){
       return (this.f.hashCode() ^ this.p.hashCode());
    }
    public String toString(){
       return this.p+"\("+this.f+"\)";
    }
}
