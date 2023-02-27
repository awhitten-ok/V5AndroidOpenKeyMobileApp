package com.openkey.server.utility;

import org.testng.annotations.Test;

public class password {
    @Test
    public void passwordEncode(){
        CustomPasswordEncoder encoder = new CustomPasswordEncoder();
        System.out.println(encoder.getPasswordEncoder().encode("MollyOpen0604!"));
    }
}
