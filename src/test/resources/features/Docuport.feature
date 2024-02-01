Feature: Docuport  left items validation

  @B2G3-159 @B2G3-251
  Scenario:validate  left side items
    And validate left navigate items of docuport for 3 user
      | supervisor | Home | Received docs | My uploads | Client | Users       | Leads | Bookkeeping | 1099 Form   | Reconciliation  |                 |
      | advisor    | Home | Received docs | My uploads | Client | Invitations | Users | Leads       | Bookkeeping | 1099 Form       | Reconciliations |
      | employee   | Home | Received docs | My uploads | Client | Bookkeeping | Users | Bookkeeping | 1099 Form   | Reconciliations |                 |



