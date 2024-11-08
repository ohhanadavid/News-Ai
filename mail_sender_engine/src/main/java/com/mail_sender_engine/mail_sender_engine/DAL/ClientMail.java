package com.mail_sender_engine.mail_sender_engine.DAL;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString(includeFieldNames = true)
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ClientMail {
    private String email;
    private String name;
}
