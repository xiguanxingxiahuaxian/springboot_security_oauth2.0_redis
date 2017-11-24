# springboot_security_oauth2.0

add requeset:

http://127.0.0.1:8080/oauth/token?client_id=client_id&client_secret=secret&grant_type=password&username=username1&password=password1&scope=read

add response:

{"access_token":"b2c338d7-c71d-4e8b-b2bf-809a2fb1b27c","token_type":"bearer","refresh_token":"3c66fd1c-60b5-44d2-a614-548941c13c25","expires_in":43051,"scope":"read"}

http://127.0.0.1:1130/oauth/token?client_id=my-trusted-client&client_secret=secret&grant_type=password&username=bob&password=bob123&scope=read

{"access_token":"25baa135-1fc3-48f3-892b-a4eddce08715","token_type":"bearer","refresh_token":"adb454ee-9a4b-4f65-a073-fc6c513a4bdd","expires_in":119,"scope":"read"}

http://127.0.0.1:1130/user?access_token=0dc2506a-1e27-4b19-be42-62ae2940e7f4
{"error":"invalid_token","error_description":"Invalid access token: 0dc2506a-1e27-4b19-be42-62ae2940e7f4"}

http://127.0.0.1:1130/user?access_token=25baa135-1fc3-48f3-892b-a4eddce08715

[{"id":1,"username":"bob","password":"2acba7f51acfd4fd5102ad090fc612ee","list":[{"id":1,"role_name":"111"}]}]