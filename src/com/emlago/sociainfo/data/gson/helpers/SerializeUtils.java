package com.emlago.sociainfo.data.gson.helpers;

import java.io.*;

public class SerializeUtils {

    @SuppressWarnings("unchecked")
    public <T> T bytesToObject(byte[] bytes) {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInput input = null;

        try {
            input = new ObjectInputStream(bis);
            return (T) input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch (IOException ex1) {
                // ignore close exception
            }

            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException ex2) {
                // ignore close exception
            }
        }
        return null;
    }

    public byte[] objectToBytes(Object obj) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = null;
        try {
            out = new ObjectOutputStream(bos);
            out.writeObject(obj);
            return bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException ignored) {
                // ignore close exception
            }

            try {
                bos.close();
            } catch (IOException ignored) {
                // ignore close exception
            }
        }
        return new byte[0];
    }
}