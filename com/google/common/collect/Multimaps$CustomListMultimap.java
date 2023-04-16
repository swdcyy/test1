package com.google.common.collect.Multimaps$CustomListMultimap;
import com.google.common.collect.AbstractListMultimap;
import java.util.Map;
import ok.x;
import java.lang.Object;
import ok.n;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Multimaps$CustomListMultimap extends AbstractListMultimap	// class@001857
{
    public x factory;
    public static final long serialVersionUID;

    public void Multimaps$CustomListMultimap(Map p0,x p1){
       super(p0);
       n.j(p1);
       this.factory = p1;
    }
    public Map createAsMap(){
       return this.createMaybeNavigableAsMap();
    }
    public Collection createCollection(){
       return this.createCollection();
    }
    public List createCollection(){
       return this.factory.get();
    }
    public Set createKeySet(){
       return this.createMaybeNavigableKeySet();
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       this.factory = p0.readObject();
       this.setMap(p0.readObject());
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       p0.writeObject(this.factory);
       p0.writeObject(this.backingMap());
    }
}
