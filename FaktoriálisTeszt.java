/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import faktoriálisprojekt.FaktoriálisKivétel;
import org.junit.Test;
import static org.junit.Assert.*;

public class FaktoriálisTeszt {
    
    public FaktoriálisTeszt() {
    }
    
    @Test
    public void faktoriálisÖt() throws FaktoriálisKivétel {
        int be = 5;
        int elvárás = 120;
        long eredmény = faktoriálisprojekt.FaktoriálisProjekt.faktoriális(be);
        assertEquals(eredmény, elvárás);
    }
    
    @Test
    public void faktoriálisNulla() throws FaktoriálisKivétel {
        int be = 0;
        int elvárás = 1;
        long eredmény = faktoriálisprojekt.FaktoriálisProjekt.faktoriális(be);
        assertEquals(eredmény, elvárás);
    }
    
    @Test
    public void faktoriálisTúlNagy() throws FaktoriálisKivétel {
        int be = 13;
        long elvárás = 6227020801L;
        long eredmény = faktoriálisprojekt.FaktoriálisProjekt.faktoriális(be);
        assertEquals(eredmény, elvárás);
    }
    
    
    @Test(expected = faktoriálisprojekt.FaktoriálisKivétel.class)
    public void faktoriálisNegatív() throws FaktoriálisKivétel {
        int be = -1;
        long eredmény = faktoriálisprojekt.FaktoriálisProjekt.faktoriális(be);
        
    }
}
