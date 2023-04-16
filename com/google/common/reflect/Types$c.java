package com.google.common.reflect.Types$c;
import java.lang.reflect.TypeVariable;
import java.lang.Class;
import java.lang.reflect.Type;
import java.lang.reflect.GenericDeclaration;
import java.lang.String;
import com.google.common.reflect.Types;
import java.lang.Object;

public final class Types$c	// class@001910
{
    public static final boolean a;

    static {
       Type[] typeArray = new Type[0];
       Types$c.a = Types$c.class.getTypeParameters()[0].equals(Types.e(Types$c.class, "X", typeArray)) ^ 0x01;
    }
    public void Types$c(){
       super();
    }
}
