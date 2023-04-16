package com.kwai.video.clipkit.error.EditorProjectInvalidException;
import java.lang.Exception;
import java.lang.String;
import java.lang.StringBuilder;

public class EditorProjectInvalidException extends Exception	// class@001a7d
{

    public void EditorProjectInvalidException(String p0){
       super("Editor project is invalid: "+p0);
    }
}
