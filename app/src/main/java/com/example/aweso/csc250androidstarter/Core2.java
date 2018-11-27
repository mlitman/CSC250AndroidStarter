package com.example.aweso.csc250androidstarter;

class Core2
{
    private static final Core2 ourInstance = new Core2();

    static Core2 getInstance()
    {
        return ourInstance;
    }

    private Core2() {
    }
}
