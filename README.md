# Nouveautés Spring Boot 3

Ceci est un petit projet permettant de montrer les nouveautés mise en place par Spring avec Spring boot 3 et Spring Framework 6.

Si vous voulez voir plus en détails les nouveautés implémenter vous pouvez lire la release note suivante :

- [Spring Boot 3 Release Notes](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Release-Notes)

## Java 17

Pour pouvoir migrer votre application spring boot 2.x.x vers spring boot 3.x.x la première étape est de migrer votre environnement java sur une version 17.

## Jakarta EE 

Spring a décidé de migrer de javax à jakarta pour toutes ses dépendances. De ce fait toutes les dépendendences javax.* sont à modifier en jakarta.*

## Spring Security 6

- WebSecurityConfigurerAdapter supprimé
- .authorizeRequests() - deprecated -> authorizeHttpRequests
- antMatchers, mvcMatchers, regexMatchers - deprecated -> requestMatchers

## Spring data

- ListCrudRepository
- PagingAndSortingRepository n'extends plus CrudRepository

## Http Interface

Avec Spring 6, Spring préconise de remplacer RestTemplate par WebClient de webflux. En effet RestTemplate même si non deprecated ne sera maintenu que pour le strict nécesaire.

Nous pouvons maintenant définir des interfaces avec des méthodes annotées pour l'exchange Http et créé un Proxy qui implémente cette interface et effectue les echanges HTTP.

[Documentation Spring](https://docs.spring.io/spring-framework/docs/6.0.0-RC2/reference/html/integration.html#rest-http-interface)

