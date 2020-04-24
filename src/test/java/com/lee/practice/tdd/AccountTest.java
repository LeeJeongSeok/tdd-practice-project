package com.lee.practice.tdd;

import org.junit.Before;
import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;


public class AccountTest {

    private Account account;

    @Before
    public void setUp() {
        account = new Account(10000);
    }

    @Test
    public void testGetBalance() throws Exception {
        assertThat(account.getBalance()).isEqualTo(10000);
    }

    @Test
    public void testDeposit() throws Exception {
        account.deposit(1000);
        assertThat(11000).isEqualTo(account.getBalance());
    }

    @Test
    public void testWithdraw() throws Exception {
        account.withDraw(1000);
        assertThat(9000).isEqualTo(account.getBalance());
    }

}
