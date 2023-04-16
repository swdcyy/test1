package com.yxcorp.utility.repo.ParamsHolder;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashSet;
import java.io.ObjectInputStream;

public class ParamsHolder implements Serializable	// class@0009d4
{
    public Set mOwners;
    public final Object mParams;
    public static final long serialVersionUID = 0x6534421706d2f9e2;

    public void ParamsHolder(Object p0){
       super();
       this.mOwners = new HashSet();
       this.mParams = p0;
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       this.mOwners = new HashSet();
    }
}
