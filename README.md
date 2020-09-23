# client-address

REST-сервис релизует такие функции как:
1. Просмотр всех клиентов без адресов

```
http://localhost:8080/getAllClients
```

2. Просмотр списка всех Client (без связанных Address), отфильтрованных по наличию заданной подстроки, входящей в name

```
http://localhost:8080/getAllClientsWithSubstring?substring=[substring]
```

3. Добавление нового Client

```
http://localhost:8080/addClient?name=[name]
```

4. Удаление Client по id

```
http://localhost:8080/removeClient?id=[id]
```

5. Получение списка Address для заданного id Client


```
http://localhost:8080/getAddress?clientId=[id]
```

6. Добавление нового Address для заданного id Client

```
http://localhost:8080/addAddress?clientId=[id]&name=[name]
```

7. Удаление Address по id

```
http://localhost:8080/removeAddress?id=[id]
```
