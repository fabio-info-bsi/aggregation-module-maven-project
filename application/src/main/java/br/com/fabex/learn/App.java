package br.com.fabex.learn;

import br.com.fabex.learn.bo.UserBO;
import br.com.fabex.learn.dto.UserDto;

public class App {

    public static void main(String[] args) {
        UserBO userBO = new UserBO();
        boolean save = userBO.save(new UserDto());
        System.out.println("Save => "+save);
    }
}
